
package barang;

public class Barang {

        String kode_barang;
        String nama_barang;
        private int stok;
        
        public Barang(String kode, String nama, int stk){
            kode_barang = kode; 
            nama_barang = nama;
            setStok(stk);
        }
        
        public void setStok(int stock){
            stok += stock;
        }
        
        public int getStok(){
            return stok;
        }
    
}


