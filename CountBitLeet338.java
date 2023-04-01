package BitManipulation;

import java.util.Scanner;

public class CountBitLeet338 {
          // function to find number of digit in binary representation of a number(n)
          static int decibin(int n,String str){
                    if(n==0){
                              return str.length();
                    }
                    str+=""+n%2;
                    return decibin(n/2, str);
          }
          // count number of 1's in index i
          static int countone(int i,int c){
                    int len=decibin(i, "");
                    for(int k=0;k<len;k++){
                              int j=i&(1<<k);
                              if(j!=0){
                                        c++;
                              }
                    }
                    return c;
          }
          // create array a where its value at every i index= number of 1's in i
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int m=n+1;
                    int a[]=new int[m];
                    for(int i=0;i<m;i++){
                              a[i]=countone(i,0);
                    }
                    for(int i=0;i<m;i++){
                              System.out.print(a[i]+" ");
                    }
                    sc.close();
          }
}
