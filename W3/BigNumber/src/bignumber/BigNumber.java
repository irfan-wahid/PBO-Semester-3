
package bignumber;

import java.util.Scanner;
import java.math.BigInteger;//untuk menggunakan BigInteger

public class BigNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        //BigInteger untuk menyimpan nilai bertipe numerik dengan digit yang sangat banyak
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
        
        
    }
    
}
