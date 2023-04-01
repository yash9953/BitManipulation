package BitManipulation;

import java.util.Scanner;

public class Checkinpowof2 {
          // function to find number of digit in binary representation of a number(n)
          static int decibin(int n,String str){
                    if(n==0){
                              return str.length();
                    }
                    str+=""+n%2;
                    return decibin(n/2, str);
          }
          // print those number which is in power of 2 upto entered range(n)
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    for(int i=1;i<=n;i++){
                              int len=decibin(i, "")-1;
                              int m=i&~(1<<len);
                              if(m==0){
                                        System.out.print(i+" ");
                              }
                              else{
                                        continue;
                              }
                    }
                    sc.close();
          }
}
