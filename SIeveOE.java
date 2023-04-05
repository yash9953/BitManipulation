package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class SIeveOE {
          // print prime number upto range(n) using 
          // Sieve Of Eratosthenes
          static boolean isprime(int n,int i){
                    if(n%i==0&&i!=n){
                              return false;
                    }else if(i==n){
                              return true;
                    }
                    return isprime(n, ++i);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    boolean a[]=new boolean[n+1];
                    Arrays.fill(a, true);
                    a[0]=false;
                    a[1]=false;
                    for(int i=2;i*i<n+1;i++){
                              // if(!isprime(i,2)){
                                        for(int j=2*i;j<n+1;j+=i){
                                                  a[j]=false;
                                        }    
                              // }
                    }
                    for(int i=0;i<n+1;i++){
                              if(a[i]){
                                        //print only prime 
                                      System.out.print(i+" "+a[i]+" , ");  
                              }
                    }
                    sc.close();
          }
}
