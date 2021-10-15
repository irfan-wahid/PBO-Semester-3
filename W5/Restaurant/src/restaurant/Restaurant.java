
package restaurant;

import java.util.Scanner;

public class Restaurant {
    //setiap tipe data diubah menjadi private agar sesuai dengan Design Hint
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    Scanner scan = new Scanner(System.in);
    
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
            System.out.println(i+". "+nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
        
            }
        }

    }

    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
    id++;
    }
    
    /*menambahkan method untuk melakukan pemesanan makanan dan mengurangi stok
      jika makanan sudah dipesan*/
    public void pesanMakanan(){
        int pesanan;
            
        System.out.println("\nMasukkan nomor makanan yang akan dipesan");
        pesanan = scan.nextInt();
        stok[pesanan]--;
    }
    
}