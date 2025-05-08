import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private double salary;
    private final int id;

    public static int count;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = count;
        ++count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", отдел " + department + ", зарплата " +
                salary + ", id " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 &&
                firstName.equals(employee.firstName) && middleName.equals(employee.middleName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department, salary);
    }

    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников ");
        for (int i = 0; i < Employee.count; i++) {
            System.out.println(i);
        }
    }

}
