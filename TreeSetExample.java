import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Grapes");
        set.add("Orange");

        // Accessing using Iterator
        System.out.println("Elements in TreeSet:");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
    

