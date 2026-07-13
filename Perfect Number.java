import java.util.Scanner;

class Perfect {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), s = 0;
        for(int i=1;i<n;i++) if(n%i==0) s+=i;
        System.out.println(s==n ? "Perfect" : "Not Perfect");
    }
}