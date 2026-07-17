import java.util.Scanner;

class SimpleInterest {

    static double interest(double p,int y,char c){

        if(c=='y'||c=='Y')
            return p*y*12/100;
        else
            return p*y*10/100;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Principal: ");
        double p=sc.nextDouble();

        System.out.print("Years: ");
        int y=sc.nextInt();

        System.out.print("Senior Citizen(y/n): ");
        char c=sc.next().charAt(0);

        System.out.println("Interest = "+interest(p,y,c));
    }
}