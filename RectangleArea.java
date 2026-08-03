public class RectangleArea {
    int length ;
    int breadth;
    public void area(){
        int area = length*breadth;
        System.out.println("Area of Recatangle : " + area);
    }
    
    public static void main(String[] args){
        RectangleArea a1 = new RectangleArea();
        a1.length = 6 ;
        a1.breadth = 8 ;
        a1.area();

    }
    
}
