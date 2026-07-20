import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int root = (int)Math.sqrt(n);

        if(root*root==n){

            System.out.println("Square Root = "+root);
            System.out.println("Square Root = "+(-root));
        }
        else{

            System.out.println("Not a Perfect Square");
        }
    }
}