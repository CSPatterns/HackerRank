import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        long sum1 = 0;
        long sum2 = 0;
        
       
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int count = a.length - 1;
        
        for(int a_i=0; a_i < n; a_i++){
            
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                System.out.println( a[a_i][a_j]);
                
                if (a[a_i] == a[a_j]){
                    sum1 += a[a_i][a_j];
                   
                }
               System.out.println("count: " + count);
                 System.out.println("b1: " + a[a_i][count]);
                
               //
                //System.out.println("sum2: " + sum2);
                
          
                
            }
            sum2 += a[a_i][count];
             count--;
            
             System.out.println("\n");
            
        }
         System.out.println("sum1: " + sum1);
         System.out.println("sum2: " + sum2);
        
        System.out.print(sum1 - sum2);
    }
}
