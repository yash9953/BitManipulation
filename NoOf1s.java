package BitManipulation;

import java.util.Scanner;

public class NoOf1s {
          // function to find number of digit in binary representation of a number(n)
          static int decibin(int n,String str){
                    if(n==0){
                              return str.length();
                    }
                    str+=""+n%2;
                    return decibin(n/2, str);
          }
          // find number of 1's occurence in a number
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    // int digit=sc.nextInt();
                    int digit=decibin(n,"");
                    int count=0;
                    for(int i=0;i<digit;i++){
                              int k=n&(1<<i);
                              if(k!=0){
                                        count++;
                              }
                    }
                    System.out.println(count);
                    sc.close();
          }
}
