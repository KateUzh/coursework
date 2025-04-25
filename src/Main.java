public class Main {
    public static void initialEmployees() {
        employees[0] = new Employee("Максим", "Иванович", "Иванов", 1,
                50_850);
        employees[1] = new Employee("Анна", "Алексеевна", "Кулебяка", 2,
                55_820);
        employees[2] = new Employee("Мария", "Васильевна", "Иванова", 2,
                54_000);
        employees[3] = new Employee("Ева", "Вадимовна", "Сидорчук", 2,
                56_700);
        employees[4] = new Employee("Валерий", "Петрович", "Пупкин", 3,
                98_050);
        employees[5] = new Employee("Глеб", "Павлович", "Пуговкин", 3,
                114_117);
        employees[6] = new Employee("Артур", "Владимирович", "Вовк", 3,
                75_003);
        employees[7] = new Employee("Макар", "Абрамович", "Борщ", 4,
                135_550);
        employees[8] = new Employee("Роман", "Дмитриевич", "Лусис", 4,
                150_200);
        employees[9] = new Employee("Василий", "Андреевич", "Кулик", 5,
                101_154);
    }

    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        initialEmployees();
        printAllEmployees();
        System.out.println("\nСумма затрат на зарплату в месяц: " + sumAllSalaryPerMonth());
        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("\nСреднее значение зарплат составляет " + calcAverageSalary());
        printEmployeesFullName();
    }

    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double sumAllSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employeeWithMinSalary.getSalary() > employee.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employeeWithMaxSalary.getSalary() < employee.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double calcAverageSalary() {
        return sumAllSalaryPerMonth() / Employee.count;
    }

    public static void printEmployeesFullName() {
        System.out.println("\nФИО всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " +
                    employee.getMiddleName());
        }
    }

}