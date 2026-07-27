import java.util.Scanner;

class Device {
    String name;

    Device(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " is ON");
    }

    void turnOff() {
        System.out.println(name + " is OFF");
    }

    void powerConsumption() {
        System.out.println("Power Consumption");
    }
}

class Light extends Device {

    Light() {
        super("Light");
    }

    @Override
    void powerConsumption() {
        System.out.println("Power Consumption : 20 Watts");
    }
}

class Fan extends Device {

    Fan() {
        super("Fan");
    }

    @Override
    void powerConsumption() {
        System.out.println("Power Consumption : 75 Watts");
    }
}

class AirConditioner extends Device {

    AirConditioner() {
        super("Air Conditioner");
    }

    @Override
    void powerConsumption() {
        System.out.println("Power Consumption : 1500 Watts");
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Device device;

        System.out.println("1. Light");
        System.out.println("2. Fan");
        System.out.println("3. Air Conditioner");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                device = new Light();
                break;
            case 2:
                device = new Fan();
                break;
            case 3:
                device = new AirConditioner();
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        device.turnOn();
        device.powerConsumption();
        device.turnOff();

        sc.close();
    }
}