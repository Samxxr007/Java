import java.util.Scanner;

class UserName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String s1 = sc.nextLine();

        System.out.print("Re-enter Username: ");
        String s2 = sc.nextLine();

        if(s1.equals(s2))
            System.out.println("User name is Valid");
        else
            System.out.println("User name is Invalid");
    }
}