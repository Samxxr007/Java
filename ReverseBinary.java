import java.util.Scanner;

public class ReverseBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        String reverse = new StringBuilder(binary).reverse().toString();

        int result = Integer.parseInt(reverse,2);

        System.out.println("Binary = " + binary);
        System.out.println("Answer = " + result);
    }
}