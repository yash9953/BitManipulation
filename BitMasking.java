package BitManipulation;

import java.util.Scanner;

public class BitMasking {
          static int get(int n,int pos){
                    int k=1<<pos;
                    int a=n&k;
                    if(a!=0){
                              return 1;
                    }
                    return 0; 
          }
          static int set(int n,int pos){
                    if(get(n, pos)==1){
                              return n;
                    }
                    int k=1<<pos;
                    int a=n^k;
                    return a;
          }
          static int clear(int n,int pos){
                    int k=1<<pos;
                    int a=n^k;
                    return a;
          }
          static int update(int n,int pos){
                    if(get(n, pos)==1){
                         n=clear(n, pos);
                         return n;    
                    }
                    n=set(n, pos);
                    return n;
          }
          // to get binary representation of number(n) after different operations
          static int decitobin(int rem,int i,int n){
                    if(n==0){
                              return rem;
                    }
                    rem=(int) (rem+(n%2)*Math.pow(10, i));
                    n=n/2;
                    i++;
                    return decitobin(rem, i, n);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    System.out.println("Enter i-th bit you want to manipulate");
                    int a=0;
                    int i=sc.nextInt();
                    System.out.println("I/p= "+decitobin(0, 0, n));
                    a=get(n, i-1);
                    System.out.println("after get "+decitobin(0, 0, a));
                    a=set(n, i-1); 
                    System.out.println("after set(0->1) "+decitobin(0, 0, a));
                    a=clear(n, i-1);
                    System.out.println("after clear(1->0) "+decitobin(0, 0, a));
                    a=update(n,i-1);
                    System.out.println("after update(0->1&1->0) "+decitobin(0, 0, a));
                    sc.close();
          }
}