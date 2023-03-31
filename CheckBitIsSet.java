package BitManipulation;

import java.util.Scanner;

public class CheckBitIsSet {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=5;
                    int b=3;
                    int s=n^b;
                    // print if s has its 2nd bit from left
                    System.out.println(s&(1<<1));
                    sc.close();
          }
}
