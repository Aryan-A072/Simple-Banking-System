// package Progress_Calculation;
import java.util.Arrays;
/*For One Student 
public class Report {
    static int result(int previous, int current){
        int progress;
        if(current >= previous){
            progress = (current - previous)%100;
        }
        else{
            progress = (previous - current)%100;
        }
        return progress;
    }
    public static void main(String[] args){
        int current = 82;
        int previous = 70;
        // System.out.println("Progress : ");
        System.out.println("Progress : "+result(previous, current)+"%");
    }
}
*/

import java.util.Arrays;

public class Report{
    static int result(int[] current, int[] previous){
        int[] progress = new int[5];
        int count = 0;
        for(int i=0; i<5;i++){        
        if(current[i] >= previous[i]){
            progress[i] = (current[i] - previous[i])%100;
            System.out.println("Increase in the result of :"+i+" by : "+progress[i]);
            count++;
        }
        else{
                progress[i] = (previous[i] - current[i])%100;
                System.out.println("Decrease in the result of :"+i+" by : "+progress[i]);
            }
            System.out.println(Arrays.toString(progress));
            // return progress[i];
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args){
        int[] current = {82,74,76,78,89};
        int[] previous = {70,60,46,79,92};
        System.out.println("Count of Students who've shown progress : "+result(current, previous));
    }
}