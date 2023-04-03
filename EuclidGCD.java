package BitManipulation;

import java.util.Scanner;

public class EuclidGCD {
          static int GCD(int a,int b){
                    if(b==1){
                              return 1;
                    }
                    return GCD(b, a%b);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println(GCD(a,b)); 
                    sc.close();
          }
}
