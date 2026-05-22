public class skillrackmay{

    public static void main(String[] args) {

        int counter = 100;

        while(counter > 10) {

            for(int innercounter = 5; innercounter <= 10; innercounter += 5) {
                System.out.println(innercounter);

                if(innercounter == 98) {
                    break;
                }
            }

            System.out.println(counter);
            counter--;
        }
    }
}