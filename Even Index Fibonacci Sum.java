import java.util.Scanner;

class EvenFibonacciSum {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N: ");
        int n=sc.nextInt();

        int terms=2*n;
        int a=0,b=1,c,sum=0;

        for(int i=0;i<=terms;i++){

            if(i%2==0)
                sum+=a;

            c=a+b;
            a=b;
            b=c;
        }

        System.out.println("Sum = "+sum);
    }
}