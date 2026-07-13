import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        char c = new Scanner(System.in).next().charAt(0);
        System.out.println("AEIOUaeiou".indexOf(c)>=0 ? "Vowel" : "Not Vowel");
    }
}