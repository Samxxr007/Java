import java.util.Scanner;

class Vehicle {
    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    void calculateRent(int days) {
        System.out.println("Rent Calculation");
    }
}

class Car extends Vehicle {

    Car() {
        super("Car");
    }

    @Override
    void calculateRent(int days) {
        System.out.println("Vehicle : " + vehicleName);
        System.out.println("Total Rent : " + (days * 1000));
    }
}

class Bike extends Vehicle {

    Bike() {
        super("Bike");
    }

    @Override
    void calculateRent(int days) {
        System.out.println("Vehicle : " + vehicleName);
        System.out.println("Total Rent : " + (days * 500));
    }
}

class Bus extends Vehicle {

    Bus() {
        super("Bus");
    }

    @Override
    void calculateRent(int days) {
        System.out.println("Vehicle : " + vehicleName);
        System.out.println("Total Rent : " + (days * 3000));
    }
}

class VehicleRentalSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Vehicle v;

        switch (choice) {
            case 1:
                v = new Car();
                break;
            case 2:
                v = new Bike();
                break;
            case 3:
                v = new Bus();
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        v.calculateRent(days);

        sc.close();
    }
}