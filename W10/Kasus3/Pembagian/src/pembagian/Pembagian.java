
package pembagian;

import java.util.Scanner;

public class Pembagian {

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in); 
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int hasil = a/b;
        
        System.out.println(hasil);
        }
        catch(Exception e){
            System.out.println("Tidak dapat dibagi 0");
        }
    }
    
}
