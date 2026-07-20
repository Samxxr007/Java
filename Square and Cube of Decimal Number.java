import java.util.Scanner;

class SquareCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        System.out.println("Square = "+(n*n));
        System.out.println("Cube = "+(n*n*n));
    }
}