package OOPSwithJAVA;

// 1. Capitalised the class name 'Car' (Standard Java convention)
class Car { 
    String brand; 
    int price;  
} 

public class objectPractice1 { 
    public static void main(String[] args) { 
        // 2. Instantiated the updated Car class
        Car c = new Car(); 
        c.brand = "BMW"; 
        c.price = 1; 

        // 3. Changed to println for better, readable output formatting
        System.out.println("Brand: " + c.brand); 
        System.out.println("Price: $" + c.price); 
    }  
} 
