public class FindMinValue {
    static int minElement(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int [] arr = {15, 4, 28, 9, 2, 19};
        System.out.print("Minimum element : " + minElement(arr));
    }
}
