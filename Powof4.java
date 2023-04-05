package BitManipulation;

import java.util.Scanner;

public class Powof4 {
          // to print number which are in power of 4 upto entered range(n)
          static boolean check(int n){
                              if(n%4!=0&&n<=4||n%4!=0){
                                        return false;
                              }
                              else if(n%4==0&&n<=4){
                                        return true;
                              }
                    return check(n/4);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    if(n%4==0&&check(n)||n==1){
                              System.out.println("Yes");
                    }else{
                              System.out.println("NOooo");
                    }
                    sc.close();
          }
}