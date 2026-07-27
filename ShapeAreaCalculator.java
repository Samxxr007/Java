import java.util.Scanner;

// Abstract parent class
abstract class Shape { 
    abstract double area(); 
} 

// Child class for Circle
class Circle extends Shape { 
    double radius; 
    
    Circle(double radius) { 
        this.radius = radius; 
    } 
    
    @Override
    double area() { 
        return Math.PI * radius * radius; // Used Math.PI for better accuracy
    } 
} 

// Child class for Rectangle
class Rectangle extends Shape { 
    double length, breadth; 
    
    Rectangle(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 
    
    @Override
    double area() { 
        return length * breadth; 
    } 
} 

// Child class for Triangle
class Triangle extends Shape { 
    double base, height; 
    
    Triangle(double base, double height) { 
        this.base = base; 
        this.height = height; 
    } 
    
    @Override
    double area() { 
        return 0.5 * base * height; 
    } 
} 

// Main class matching the required file name
class ShapeAreaCalculator { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Shape shape = null; // Initialized to prevent compilation errors
        
        System.out.println("1. Circle"); 
        System.out.println("2. Rectangle"); 
        System.out.println("3. Triangle"); 
        System.out.print("Enter Choice: "); 
        int choice = sc.nextInt(); 
        
        switch (choice) { 
            case 1: 
                System.out.print("Enter Radius: "); 
                shape = new Circle(sc.nextDouble()); 
                break; 
            case 2: 
                System.out.print("Enter Length: "); 
                double l = sc.nextDouble(); 
                System.out.print("Enter Breadth: "); 
                double b = sc.nextDouble(); 
                shape = new Rectangle(l, b); 
                break; 
            case 3: 
                System.out.print("Enter Base: "); 
                double base = sc.nextDouble(); 
                System.out.print("Enter Height: "); 
                double h = sc.nextDouble(); 
                shape = new Triangle(base, h); 
                break; 
            default: 
                System.out.println("Invalid Choice"); 
                sc.close(); 
                return; 
        } 
        
        System.out.println("Area = " + shape.area()); 
        sc.close(); 
    } 
}
