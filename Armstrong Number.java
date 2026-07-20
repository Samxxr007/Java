import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp=n,sum=0;

        while(temp!=0){

            int rem=temp%10;

            sum += rem*rem*rem;

            temp/=10;
        }

        if(sum==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}