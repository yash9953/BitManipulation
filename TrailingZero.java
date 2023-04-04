package BitManipulation;

import java.util.Scanner;

public class TrailingZero {
          // static int findTrailingZeros(int n){
          //           if (n < 0) // Negative Number Edge Case
          //                return -1;
               
          //           // Initialize result
          //           int count = 0;
               
          //           // Keep dividing n by powers
          //           // of 5 and update count
          //           for (int i = 5; n / i >= 1; i *= 5)
          //                count += n / i;
               
          //           return count;
          //           }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int i=sc.nextInt();
                    int t=0;
                    for(int n=0;n<=i;){
                              t=n;
                              t=t/5;
                              int copy=t;
                              while(copy>=5){
                                        copy=copy/5;
                                        t+=copy;
                              }
                              System.out.print(n+"->"+t+" "); 
                              n=n+1;    
                    }
                    sc.close();
          }
}
