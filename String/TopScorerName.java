package String;
import java.util.*;
/*Problem Statement :
Input is:
5
BatsmanA,45
BatsmanB,52
BatsmanC,12
BatsmanD,9
BatsmanE,78
output:
45  → highest = 45,  BatsmanA
52  → highest = 52,  BatsmanB
12  → no change
9   → no change
78  → highest = 78,  BatsmanE
Output:
BatsmanE */
public class TopScorerName {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int highestscore = -1;
        String highscorename="";
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            String [] data = line.split(",");
            String name = data[0];
            int score = Integer.parseInt(data[1]);
            if(score > highestscore){
                highestscore = score;
                highscorename = name;
            }

        }
     System.out.print(highscorename);
     }
}
