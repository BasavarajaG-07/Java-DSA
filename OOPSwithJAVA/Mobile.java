package OOPSwithJAVA;

public class Mobile {
    String brand;
    int price;
    String model;
    

public static void main(String[] args){

    Mobile m1 = new Mobile();
    m1.brand = "iphone";
    m1.price = 1000;
    m1.model = "iphone 17 promax";
    
    Mobile m2 = new Mobile();
    m2.brand = "sumsung";
    m2.price = 1000;
    m2.model = "s24ultra";

    System.out.println("Mobile1 : ");
    System.out.println("Brand : "+ m1.brand);
    System.out.println("Price : $" + m1.price);
    System.out.println("Model : "+ m1.model);

    System.out.println();

    System.out.println("Mobile2 : ");
    System.out.println("Brand : "+ m2.brand);
    System.out.println("Price : $" + m2.price);
    System.out.println("Model : "+ m2.model);

      }
}