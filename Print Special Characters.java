import java.util.Scanner;

class SpecialCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();

        int count=0;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(!Character.isLetterOrDigit(ch) && ch!=' '){

                System.out.print(ch+" ");
                count++;
            }
        }

        System.out.println("\nCount = "+count);
    }
}