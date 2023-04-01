package BitManipulation;

import java.util.Scanner;

public class CountchangedDigit {
          // function to find number of digit in binary representation of a number(n)
          static int decibin(int n,String str){
                    if(n==0){
                              return str.length();
                    }
                    str+=""+n%2;
                    return decibin(n/2, str);
          }
          // count number of time a's bit change for that a=b
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int digit=decibin(a, "");
                    int c=0;
                    for(int i=0;i<digit;i++){
                              int k=1<<i;
                              int m=a&k;
                              int n=b&k;
                              if(a==b){
                                        break;
                              }
                              if(m==n){
                                        continue;
                              }
                              else{
                                        if(m==0){
                                                  a=a|k;
                                        }
                                        else{
                                                  a=a&~k;
                                        }
                                        c++;
                              }
                    }
                    System.out.println(a+" "+b+" "+c);
                    sc.close();
          }
}
