package BitManipulation;

import java.util.Scanner;

public class NumberDiv {
          // inclusio-exclusio based
          // print numbers from 1-1000 divisible by a&b
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int a=5;
                    int b=7;
                    int n=sc.nextInt();
                    int i=1;
                    while(true){
                              if(a*b*i>n){
                                        --i;
                                        // System.out.println(i);
                                        break;
                              }
                              ++i;
                    }
                    int c=0;
                    for(int j=1;j<=n;j++){
                              if(j%5==0||j%7==0){
                                        c++;
                                        System.out.print(j+" ");
                              }
                    }
                    System.out.println();
                    System.out.println(c);
                    sc.close();
          }
}
