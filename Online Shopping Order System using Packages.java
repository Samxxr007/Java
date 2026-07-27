import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }
}

class Order {
    Product product;
    int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    void generateBill() {
        product.displayProduct();
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Amount : " + (product.price * quantity));
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product p = new Product(id, name, price);
        Order o = new Order(p, quantity);

        System.out.println("\n----- BILL -----");
        o.generateBill();

        sc.close();
    }
}