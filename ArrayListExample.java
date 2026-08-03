import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String>basu = new ArrayList<>();
        basu.add("Basva");
        basu.add("king");
        System.out.println(basu);
        System.out.println(basu.size());
        basu.remove("king");
        System.out.println(basu);
    }
}
