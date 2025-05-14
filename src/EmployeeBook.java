public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
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
    }

    public void printAllEmployees() {
        System.out.println("\nСписок всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double sumAllSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if ((employee != null) && (employeeWithMinSalary == null || employeeWithMinSalary.getSalary() >
                    employee.getSalary())) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if ((employee != null) && (employeeWithMaxSalary == null || employeeWithMaxSalary.getSalary() <
                    employee.getSalary())) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public double calcAverageSalary() {
        int i = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                i++;
            }
        }
        return sum / i;
    }

    public void printEmployeesFullName() {
        System.out.println("\nФИО всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName());
            }
        }
    }

    public void indexingSalary(double percent) {
        double index = percent / 100;
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (index + 1));
            }
        }
    }

    public Employee findEmployeeWithMinSalaryInDep(int department) {
        Employee employeeWithMinSalaryInDep = null;
        for (Employee employee : employees) {
            if ((employee != null && department == employee.getDepartment()) && (employeeWithMinSalaryInDep == null ||
                    employeeWithMinSalaryInDep.getSalary() > employee.getSalary())) {
                employeeWithMinSalaryInDep = employee;
            }
        }
        return employeeWithMinSalaryInDep;
    }

    public Employee findEmployeeWithMaxSalaryInDep(int department) {
        Employee employeeWithMaxSalaryInDep = null;
        for (Employee employee : employees) {
            if ((employee != null && department == employee.getDepartment()) && (employeeWithMaxSalaryInDep == null ||
                    employeeWithMaxSalaryInDep.getSalary() < employee.getSalary())) {
                employeeWithMaxSalaryInDep = employee;
            }
        }
        return employeeWithMaxSalaryInDep;
    }

    public double sumAllSalaryInDep(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if ((employee != null) && (department == employee.getDepartment())) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double calcAverageSalaryInDep(int department) {
        int i = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if ((employee != null) && (department == employee.getDepartment())) {
                sum += employee.getSalary();
                i++;
            }
        }
        return sum / i;
    }

    public void indexingSalaryInDep(int department, double indexationPercentage) {
        double index = indexationPercentage / 100;
        for (Employee employee : employees) {
            if ((employee != null) && (department == employee.getDepartment())) {
                employee.setSalary(employee.getSalary() * (index + 1));
            }
        }
    }

    public void printEmployeesInDep(int department) {
        System.out.println("\nСотрудники " + department + " отдела: ");
        for (Employee employee : employees) {
            if ((employee != null) && (department == employee.getDepartment())) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " +
                        employee.getMiddleName() + ", id " + employee.getId() + ", зарплата " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSmallSalary(double relativeSalary) {
        System.out.println("\nСотрудники с зарплатой меньше " + relativeSalary + " руб:");
        for (Employee employee : employees) {
            if ((employee != null) && (relativeSalary > employee.getSalary())) {
                System.out.println("id " + employee.getId() + ", " + employee.getLastName() + " " +
                        employee.getFirstName() + " " + employee.getMiddleName() + ", зарплата " +
                        employee.getSalary() + " руб");
            }
        }
    }

    public void printEmployeesWithBigSalary(double relativeSalary) {
        System.out.println("\nСотрудники с зарплатой больше " + relativeSalary + " руб:");
        for (Employee employee : employees) {
            if ((employee != null) && (relativeSalary <= employee.getSalary())) {
                System.out.println("id " + employee.getId() + ", " + employee.getLastName() + " " +
                        employee.getFirstName() + " " + employee.getMiddleName() + ", зарплата " +
                        employee.getSalary() + " руб");
            }
        }
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i< employees.length; i++) {
            if (employees[i] != null && id == employees[i].getId()) {
                System.out.println("\nСотрудник с id " + id + " удалён");
                employees[i] = null;
                return;
            }
        }
    }

    public void findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && id == employee.getId()) {
                System.out.println("\nСотрудник с выбранным id: " + employee);
            }
        }
    }
}
