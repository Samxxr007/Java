import java.util.Scanner;

class GCDLCM {

    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int g=arr[0];
        int l=arr[0];

        for(int i=1;i<n;i++){
            g=gcd(g,arr[i]);
            l=lcm(l,arr[i]);
        }

        System.out.println("GCD = "+g);
        System.out.println("LCM = "+l);
    }
}