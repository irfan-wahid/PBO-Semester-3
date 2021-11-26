
package fileoperation;

import java.io.*;

public class FileOperation {

    public static void main(String[] args){

        try{  
            FileReader f = new FileReader("a.txt");
            System.out.println(f);
           // f.close();
        }
       catch(FileNotFoundException e){  
            System.out.println("Tidak dapat membuka file");  
        }  
    }
    
}
