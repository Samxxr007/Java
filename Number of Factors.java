import java.util.Scanner;

class Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int count = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }

        System.out.println("Number of Factors = "+count);
    }
}