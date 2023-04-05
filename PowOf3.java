package BitManipulation;

import java.util.Scanner;

public class PowOf3 {
          // to print number which are in power of 4 upto entered range(n)
          static boolean check(int n){
                    if(n%3!=0&&n<=3||n%3!=0){
                              return false;
                    }
                    else if(n%3==0&&n<=3){
                              return true;
                    }
                    return check(n/3);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    if(n%3==0&&check(n)||n==1){
                              System.out.println("Yes");
                    }else{
                              System.out.println("NOooo");
                    }
                    sc.close();
          }
}
