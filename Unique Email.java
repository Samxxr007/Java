import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> emails = new HashSet<>();

        System.out.print("Enter Number of Email IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Email IDs:");

        for (int i = 0; i < n; i++) {
            emails.add(sc.nextLine());
        }

        System.out.println("Unique Email IDs:");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println("Total Unique Entries: " + emails.size());

        sc.close();
    }
}