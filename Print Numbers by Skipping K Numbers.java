import java.util.Scanner;

class SkipNumbers {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();

        for(int i=m;i<=n;i=i+k+1)
            System.out.print(i+" ");
    }
}    

    

