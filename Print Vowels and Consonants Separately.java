import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.next().toLowerCase();

        System.out.print("Vowels: ");

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.print(ch+" ");
        }

        System.out.print("\nConsonants: ");

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(Character.isLetter(ch) && !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                System.out.print(ch+" ");
        }
    }
}