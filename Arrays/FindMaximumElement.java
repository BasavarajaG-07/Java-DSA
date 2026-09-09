public class FindMaximumElement {
    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length ; i++){
        if(max<arr[i]){
            max = arr[i];
        }
        }
        return max;

    }
    public static void main(String[] args){
        int[] arr = {10, 25, 7, 42, 18};
        System.out.print("Maximum Elemnent : " + maxElement(arr));
      
    }
    
}
