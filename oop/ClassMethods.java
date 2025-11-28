import java.util.*;

class Employee {
    int empId;
    String empName;
    int empSalary;

    /* Initialize th Employee Object */
    public void setEmployee(int id, String name, int salary) {
        empId = id;
        empName = name;
        empSalary = salary;
    }

    /* Display the Employee Object */
    public void getEmployee() {
        System.out.println("ID     - " + empId);
        System.out.println("NAME   - " + empName);
        System.out.println("SALARY - " + empSalary);
        System.out.println("_______________________");
    }
}

public class ClassMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int id, salary;
        String name;

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();

        e1.setEmployee(101, "John", 35000);
        e2.setEmployee(102, "Sam", 25000);
        e3.setEmployee(103, "Bob", 55000);

        System.out.print("ENTER EMPLOYEE ID     - ");
        id = s.nextInt();
        System.out.print("ENTER EMPLOYEE NAME   - ");
        name = s.next();
        System.out.print("ENTER EMPLOYEE SALARY - ");
        salary = s.nextInt();
        e4.setEmployee(id, name, salary);

        e1.getEmployee();
        e2.getEmployee();
        e3.getEmployee();
        e4.getEmployee();

        s.close();
    }
}
