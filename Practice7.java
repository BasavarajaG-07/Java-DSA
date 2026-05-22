public class Practice7 {
    public static void main(String[] args){
        int year=2023;
        if((year % 4 ==0 && year %100 !=0)||(year % 400 ==0)){
            System.out.println("its a leap year " + year );
        }
        else{
            System.out.println("its not a leap year");
        }
    }
    
}
