import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> emp = new LinkedList<>();
        
        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        System.out.println("Enter Employee IDs:");

        for (int i = 0; i < n; i++) {
            emp.add(sc.nextInt());
        }

        System.out.println("Forward Order:");
        for (int id : emp) {
            System.out.print(id + " ");
        }

        System.out.println("\nReverse Order:");
        ListIterator<Integer> it = emp.listIterator(emp.size());

        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }

        sc.close();
    }
}