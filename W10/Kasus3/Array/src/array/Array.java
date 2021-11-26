
package array;

public class Array {

    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4};
        
        try{
            for(int i=0; i<6; i++){
                System.out.println(angka[i]);
            }
        }
        catch(Exception e){
            System.out.println("Jumlah index tidak sesuai dengan jumlah nilai array yang telah didefinisikan ");
        }
        
    }
    
}
