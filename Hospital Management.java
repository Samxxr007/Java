import java.util.Scanner;

interface MedicalRecord {
    void addRecord();
    void displayRecord();
}

class Patient implements MedicalRecord {
    int id;
    String name;
    String disease;

    public void addRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        name = sc.nextLine();

        System.out.print("Enter Disease: ");
        disease = sc.nextLine();
    }

    public void displayRecord() {
        System.out.println("\nPatient Record");
        System.out.println("Patient ID : " + id);
        System.out.println("Patient Name : " + name);
        System.out.println("Disease : " + disease);
    }
}

class Doctor implements MedicalRecord {
    int id;
    String name;
    String specialization;

    public void addRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Doctor ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        name = sc.nextLine();

        System.out.print("Enter Specialization: ");
        specialization = sc.nextLine();
    }

    public void displayRecord() {
        System.out.println("\nDoctor Record");
        System.out.println("Doctor ID : " + id);
        System.out.println("Doctor Name : " + name);
        System.out.println("Specialization : " + specialization);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Patient");
        System.out.println("2. Doctor");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        MedicalRecord record;

        if (choice == 1) {
            record = new Patient();
        } else {
            record = new Doctor();
        }

        record.addRecord();
        record.displayRecord();

        sc.close();
    }
}