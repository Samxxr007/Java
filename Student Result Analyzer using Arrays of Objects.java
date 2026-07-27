import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int m1, m2, m3;
    int total;
    double average;
    String grade;

    void getData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks in 3 Subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else
            grade = "F";
    }

    void display() {
        System.out.println("\nRoll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].getData(sc);
            s[i].calculate();
        }

        int topper = 0;

        for (int i = 1; i < n; i++) {
            if (s[i].total > s[topper].total)
                topper = i;
        }

        System.out.println("\n----- Student Details -----");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        System.out.println("\nClass Topper : " + s[topper].name);
        System.out.println("Top Score : " + s[topper].total);

        sc.close();
    }
}