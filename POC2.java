package BitManipulation;

import java.util.Scanner;

public class POC2 {
          static int countbit(int n,int c){
                    if(n%2==1){
                              return c;
                    }
                    return countbit(n>>1, ++c);
          }
          // if 2 non-repeating element occurs in an array
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int a[]=new int[n];
                    for(int i=0;i<n;i++){
                              a[i]=sc.nextInt();
                    }
                    int res=0;
                    for(int i=0;i<n;i++){
                              res^=a[i];
                    }
                    int res2=res;
                    // find first set bit position
                    int pos=countbit(res,0);
                    // System.out.println(pos);
                    int k=1<<pos;
                    // System.out.println(k);
                    for(int i=0;i<n;i++){
                              // check pos bit of array elements
                              int m=a[i]&k;
                              if(m==k){
                                        res2^=a[i];
                              }
                              else{
                                        res^=a[i];
                              }
                    }
                    System.out.println(res+" "+res2);
                    sc.close();
          }
}
