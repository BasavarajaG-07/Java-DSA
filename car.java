public class car {
    String Brand;
    String color;
    int price;
    void Display(){
        System.out.println("Brand : " + Brand);
        System.out.println("color : " + color);
        System.out.println("price : " + price);
    }
public static void main(String[] args){
    car c1 = new car();
    c1.Brand = "BMW";
    c1.color = "Black";
    c1.price = 5000000;

    car c2 = new car ();
    c2.Brand = "Tata";
    c2.color = "White";
    c2.price = 1000000;
     c1.Display();
     c2.Display();
}
    
}
