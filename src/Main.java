public class Main {

    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
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
                101_150);
        printAllEmployees();
        System.out.println("\nСумма затрат на зарплату в месяц: " + sumAllSalaryPerMonth() + " руб");
        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("\nСреднее значение зарплат составляет " + calcAverageSalary() + " руб");
        printEmployeesFullName();
        indexingSalary(10);
        System.out.println("\nСотрудник с минимальной зарплатой в выбранном отделе "
                + findEmployeeWithMinSalaryInDep(5));
        System.out.println("\nСотрудник с максимальной зарплатой в выбранном отделе "
                + findEmployeeWithMaxSalaryInDep(4));
        System.out.println("\nСумма затрат на зарплату по отделу составляет " +
                sumAllSalaryInDep(2) + " руб");
        System.out.println("\nСредняя зарплата по отделу составляет " +
                calcAverageSalaryInDep(1) + " руб");
        indexingSalaryInDep(3, 13);
        printEmployeesInDep(4);
        printEmployeesWithSmallSalary(120_000);
        printEmployeesWithBigSalary(100_000);
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
            if (employees != null) {
                sum += employee.getSalary();
            }
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
        int i = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if (employees != null) {
                sum += employee.getSalary();
                i++;
            }
        }
        return sum / i;
    }

    public static void printEmployeesFullName() {
        System.out.println("\nФИО всех сотрудников:");
        for (Employee employee : employees) {
            if (employees != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName());
            }
        }
    }

    public static void indexingSalary(double percent) {
        double index = percent / 100;
        for (Employee employee : employees) {
            if (employees != null) {
                employee.setSalary(employee.getSalary() * (index + 1));
            }
        }
    }

    public static Employee findEmployeeWithMinSalaryInDep(int department) {
        Employee employeeWithMinSalaryInDep = null;
        for (Employee employee : employees) {
            if ((department == employee.getDepartment() && employee != null) && (employeeWithMinSalaryInDep == null ||
                    employeeWithMinSalaryInDep.getSalary() > employee.getSalary())) {
                employeeWithMinSalaryInDep = employee;
            }
        }
        return employeeWithMinSalaryInDep;
    }

    public static Employee findEmployeeWithMaxSalaryInDep(int department) {
        Employee employeeWithMaxSalaryInDep = null;
        for (Employee employee : employees) {
            if ((department == employee.getDepartment() && employee != null) && (employeeWithMaxSalaryInDep == null ||
                    employeeWithMaxSalaryInDep.getSalary() < employee.getSalary())) {
                employeeWithMaxSalaryInDep = employee;
            }
        }
        return employeeWithMaxSalaryInDep;
    }

    public static double sumAllSalaryInDep(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if ((employees != null) && (department == employee.getDepartment())) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static double calcAverageSalaryInDep(int department) {
        int i = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if ((employees != null) && (department == employee.getDepartment())) {
                sum += employee.getSalary();
                i++;
            }
        }
        return sum / i;
    }

    public static void indexingSalaryInDep(int department, double indexationPercentage) {
        double index = indexationPercentage / 100;
        for (Employee employee : employees) {
            if ((employees != null) && (department == employee.getDepartment())) {
                employee.setSalary(employee.getSalary() * (index + 1));
            }
        }
    }

    public static void printEmployeesInDep(int department) {
        System.out.println("\nСотрудники " + department + " отдела: ");
        for (Employee employee : employees) {
            if ((employees != null) && (department == employee.getDepartment())) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName() + ", id " + employee.getId() + ", зарплата " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSmallSalary(double relativeSalary) {
        System.out.println("\nСотрудники с зарплатой меньше " + relativeSalary + " руб:");
        for (Employee employee : employees) {
            if ((employees != null) && (relativeSalary > employee.getSalary())) {
                System.out.println("id " + employee.getId() + ", " + employee.getLastName() + " " +
                        employee.getFirstName() + " " + employee.getMiddleName() + ", зарплата " +
                        employee.getSalary() + " руб");
            }
        }
    }

    public static void printEmployeesWithBigSalary(double relativeSalary) {
        System.out.println("\nСотрудники с зарплатой больше " + relativeSalary + " руб:");
        for (Employee employee : employees) {
            if ((employees != null) && (relativeSalary <= employee.getSalary())) {
                System.out.println("id " + employee.getId() + ", " + employee.getLastName() + " " +
                        employee.getFirstName() + " " + employee.getMiddleName() + ", зарплата " +
                        employee.getSalary() + " руб");
            }
        }
    }
}