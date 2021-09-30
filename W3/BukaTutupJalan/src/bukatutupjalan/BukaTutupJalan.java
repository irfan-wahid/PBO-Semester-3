
package bukatutupjalan;

import java.util.Scanner;

public class BukaTutupJalan {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String mobil1= sc.next();
        String mobil2= sc.next();       
        String mobil3= sc.next();
        String mobil4= sc.next();
        
        //menggabungkan beberapa inputan string menjadi 1 string
        String gabung = mobil1+mobil2+mobil3+mobil4;
        
        //Merubah dari tipe data String menjadi Long menggunakan parseLong
        long x = Long.parseLong(gabung);
        
        Long intGabung = (x-999999)%5;
                
        if(intGabung == 0){
            System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
    }
    
}
