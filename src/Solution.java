
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int size = 1;
        while (size <= s.length() / 2) {
            long num1=0;
            long num2=0;
            int temp = size;
            int i;

            for (i = 0; i <= s.length() - (temp * 2); ) {
                
                
                 num1 = Long.parseLong(s.substring(i, i + temp));
                 num2 = Long.parseLong(s.substring(i + temp, i + temp + temp));
                if(s.charAt(i)=='0'||s.charAt(i+temp)=='0'){
                   
                    break;
                }
                if (num1 + 1 == num2)i += temp; 
                else if (num1 > num2) {
                    if ((i + temp + temp + 1) <= s.length()) {
                        num2 = Long.parseLong(s.substring(i + temp, i + temp + temp + 1));
                        if (num1 + 1 == num2){
                            i += temp;
                            temp++;
                        }
                                             
                        else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
           // i>(s.length()-(temp * 2)) && 
        if(i>(s.length()-(temp * 2)) && num2==Long.parseLong(s.substring(s.length()-temp, s.length())) ){
            System.out.println("YES "+Long.parseLong(s.substring(0, size)));
            return;
        }else{
            size++;
        }
        

        }
        System.out.println("NO");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.next();

            separateNumbers(s);
        }

        scanner.close();
    }
}
