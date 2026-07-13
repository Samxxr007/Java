import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        System.out.println(age >= 18 ? "Eligible" : "Not Eligible");
    }
}