import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("Salary Calculation");
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

class PermanentEmployee extends Employee {
    double basicSalary;

    PermanentEmployee(int id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override
    void calculateSalary() {
        double salary = basicSalary + (0.20 * basicSalary);
        display();
        System.out.println("Permanent Employee Salary : " + salary);
    }
}

class ContractEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    ContractEmployee(int id, String name, int hoursWorked, double ratePerHour) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        display();
        System.out.println("Contract Employee Salary : " + salary);
    }
}

 class EmployeePayrollSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Permanent Employee");
        System.out.println("2. Contract Employee");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        Employee emp;

        if (choice == 1) {
            System.out.print("Enter Basic Salary: ");
            double salary = sc.nextDouble();

            emp = new PermanentEmployee(id, name, salary);
        } else {
            System.out.print("Enter Hours Worked: ");
            int hours = sc.nextInt();

            System.out.print("Enter Rate Per Hour: ");
            double rate = sc.nextDouble();

            emp = new ContractEmployee(id, name, hours, rate);
        }

        emp.calculateSalary();

        sc.close();
    }
}