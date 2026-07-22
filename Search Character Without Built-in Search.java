import java.util.Scanner;

class SearchCharacter {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        char ch=sc.next().charAt(0);

        boolean found=false;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==ch){

                System.out.println("Found at Index "+i);
                found=true;
                break;
            }
        }

        if(!found)
            System.out.println("Character Not Found");
    }
}