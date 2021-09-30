
package inputoutput2;

import java.util.Scanner;

public class InputOutput2 {

    public static void main(String[] args) {
        
        String[] huruf = new String[3];
        int[] angka = new int[3];
        
        Scanner sc = new Scanner(System.in);
                
        for(int i=0; i<huruf.length; i++){
            huruf[i] = sc.next();
            angka[i] = sc.nextInt();
        }
        
        System.out.println("======================");
        for(int x=0; x<huruf.length; x++){
            System.out.printf("%-14s   %03d\n", huruf[x], angka[x]);
        }
        System.out.println("======================");      
    }
    
}
