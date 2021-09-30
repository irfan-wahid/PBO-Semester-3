
package gajiagen;

import java.util.Scanner;

public class GajiAgen {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int gajiPokok = 500000;
        int item = 50000;
        double gajiAkhir; 
        double x;
        
        int penjualan = sc.nextInt();
        
        if (penjualan >=80){
            x = 0.35*item*penjualan;
            gajiAkhir = gajiPokok + x;
            System.out.println(gajiAkhir);
        }
        if (penjualan >=40 && penjualan <80){
            x = 0.25*item*penjualan;
            gajiAkhir = gajiPokok + x;
            System.out.println(gajiAkhir);
        }
        if (penjualan >=15 && penjualan <40){
            x = 0.1*item*penjualan;
            gajiAkhir = gajiPokok + x;
            System.out.println(gajiAkhir);
        }
        if (penjualan <15){
            x = 0.15*((15-penjualan)*50000);
            gajiAkhir = gajiPokok - x;
            System.out.println(gajiAkhir);
        }        
    }
    
}
