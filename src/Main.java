public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        System.out.println("\nСумма затрат на зарплату в месяц: " + employeeBook.sumAllSalaryPerMonth() + " руб");
        System.out.println("\nСотрудник с минимальной зарплатой: " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("\nСотрудник с максимальной зарплатой: " + employeeBook.findEmployeeWithMaxSalary());
        System.out.println("\nСреднее значение зарплат составляет " + employeeBook.calcAverageSalary() + " руб");
        employeeBook.printEmployeesFullName();
        employeeBook.indexingSalary(10);
        System.out.println("\nСотрудник с минимальной зарплатой в выбранном отделе "
                + employeeBook.findEmployeeWithMinSalaryInDep(2));
        System.out.println("\nСотрудник с максимальной зарплатой в выбранном отделе "
                + employeeBook.findEmployeeWithMaxSalaryInDep(2));
        System.out.println("\nСумма затрат на зарплату по отделу составляет " +
                employeeBook.sumAllSalaryInDep(2) + " руб");
        System.out.println("\nСредняя зарплата по отделу составляет " +
                employeeBook.calcAverageSalaryInDep(2) + " руб");
        employeeBook.indexingSalaryInDep(2, 13);
        employeeBook.printEmployeesInDep(2);
        employeeBook.printEmployeesWithSmallSalary(120_000);
        employeeBook.printEmployeesWithBigSalary(100_000);

        employeeBook.removeEmployee(8);
        employeeBook.printAllEmployees();
        employeeBook.addEmployee("Екатерина", "Вадимовна", "Ужастина", 5,
                50_000);
        employeeBook.printAllEmployees();
        employeeBook.findEmployeeById(9);
    }
}