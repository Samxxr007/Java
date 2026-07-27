import java.util.Scanner;

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean issued;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book Already Issued.");
        }
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is Already Available.");
        }
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        System.out.println("Status  : " + (issued ? "Issued" : "Available"));
        System.out.println();
    }
}

class LibraryBookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[10];
        int count = 0, choice;

        do {
            System.out.println("\n1.Add Book");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Search Book");
            System.out.println("5.Display All");
            System.out.println("6.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    books[count++] = new Book(id, title, author, price);
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId() == id) {
                            books[i].issueBook();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId() == id) {
                            books[i].returnBook();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (books[i].getBookId() == id) {
                            books[i].display();
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < count; i++) {
                        books[i].display();
                    }
                    break;

                case 6:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}