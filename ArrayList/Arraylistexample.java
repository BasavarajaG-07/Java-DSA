package ArrayList;
import java.util.ArrayList;
public class Arraylistexample {
  public static void main(String[] args){ 
    ArrayList<Integer> numbers = new ArrayList<>();

  
      numbers.add(10);
      numbers.add(20);
      numbers.add(30);
      numbers.add(1,25);
      numbers.remove(2);
      System.out.println("Final elements in ArrayList : " + numbers);
      System.out.println("Size of the ArrayList : "+numbers.size());
  }
    
}
