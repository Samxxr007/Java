import java.util.Scanner;

class Admission {

    void calculateFee(double fee) {
        System.out.println("Undergraduate Fee : " + fee);
    }

    void calculateFee(double fee, int years) {
        System.out.println("Postgraduate Fee : " + (fee * years));
    }

    void calculateFee(double fee, double scholarship) {
        double finalFee = fee - scholarship;
        System.out.println("Scholarship Student Fee : " + finalFee);
    }
}

class UniversityAdmissionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Admission a = new Admission();

        System.out.println("1. Undergraduate");
        System.out.println("2. Postgraduate");
        System.out.println("3. Scholarship Student");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Undergraduate Fee: ");
                double ugFee = sc.nextDouble();
                a.calculateFee(ugFee);
                break;

            case 2:
                System.out.print("Enter Annual Fee: ");
                double pgFee = sc.nextDouble();

                System.out.print("Enter Number of Years: ");
                int years = sc.nextInt();

                a.calculateFee(pgFee, years);
                break;

            case 3:
                System.out.print("Enter Total Fee: ");
                double fee = sc.nextDouble();

                System.out.print("Enter Scholarship Amount: ");
                double scholarship = sc.nextDouble();

                a.calculateFee(fee, scholarship);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}