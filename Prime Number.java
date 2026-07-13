import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), i;
        for(i=2;i<n;i++) if(n%i==0) break;
        System.out.println(i==n ? "Prime" : "Not Prime");
    }
}