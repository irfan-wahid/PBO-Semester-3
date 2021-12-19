import java.util.ArrayList;
import java.util.Collection;

public class Main {
    
    //Membuat method GenericWildCard
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.print(e + ", ");
        }
        System.out.println("\n");
    }
    
    //Membuat method GenericMethod
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
       
    public static void main(String[] args) {
        
        //Penggunaan GenericClass
        GenericClass<String> type = new GenericClass<>();
        System.out.println("Nama Mahasiswa:");
        type.setNama("Messi");
        System.out.println(type.getNama());
        
        //Penggunaan Generic Method
        Collection<String> matkul = new ArrayList<>();
        System.out.println("\nMata kuliah diambil:");
        matkul.add("PBO");
        matkul.add("Basis Data");
        matkul.add("PPL");
        printCollection(matkul);
              
        Integer nilai[] = {70, 75, 90};
        
        //Penggunaan Generic Method
        System.out.println("Nilai matkul:");
        printArray(nilai);   // pass an Integer array
        
        //Penggunaan Generic Interface
        GenericInterface<Integer> a = new GenericInterface<Integer>(nilai);
        System.out.println("Nilai matkul tertinggi:");
        System.out.println(a.max());
        
        //Penggunaan Generic Bounded
        System.out.printf("\nMax of %d, %d and %d is %d\n\n", 
        70, 75, 90, GenericBound.maxNilai(70, 75, 90 ));
    }
}
