


import java.util.Scanner;

/**
 *
 * @author Tanvirul Islam
 */
public class Problem71A {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       sc.nextLine();
       for(int i=0;i<num;i++){
           abbreviation(sc.nextLine());
   
       }
       
    }
    
    public static void abbreviation(String s){
        int len=s.length();
        if(len<11)System.out.println(s);
        else{
            String temp=s.charAt(0)+String.valueOf(len-2)+s.charAt(len-1);
            System.out.println(temp);
        
        }
    
    }
    
}
