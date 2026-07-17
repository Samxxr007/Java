import java.util.Scanner;

class LeapYear {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Date (dd/mm/yyyy): ");

        String date=sc.next();

        String s[]=date.split("/");

        int year=Integer.parseInt(s[2]);

        if((year%400==0)||(year%4==0 && year%100!=0))
            System.out.println("Leap Year");
        else
            System.out.println("Non Leap Year");
    }
}