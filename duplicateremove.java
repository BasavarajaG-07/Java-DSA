import java.util.ArrayList;
import java.util.Scanner;

class duplicateremove {

    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);     // Add the first element

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
    
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    ArrayList<Integer> result = removeDuplicates(arr);
}
