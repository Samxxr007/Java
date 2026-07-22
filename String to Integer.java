import java.util.Scanner;

class StringToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String s = sc.next();

        int num = Integer.parseInt(s);

        System.out.println("Integer = "+num);
    }
}