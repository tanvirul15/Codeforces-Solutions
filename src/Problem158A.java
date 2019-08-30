
import java.util.Scanner;


/**
 *
 * @author Tanvirul Islam
 */
public class Problem158A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int perticipant=sc.nextInt();
        int min_score=sc.nextInt();
        int score[]=new int[perticipant];
        for(int i=0;i<perticipant;i++){
            score[i]=sc.nextInt();
        }
        
        int count=0;
        for(int i=0;i<perticipant;i++){
            if(score[i]>=score[min_score-1]&&score[i]>0)count++;
            else break;
        }
        System.out.println(count);
    
    
    }
    
}
