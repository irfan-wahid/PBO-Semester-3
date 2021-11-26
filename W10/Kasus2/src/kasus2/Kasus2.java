
package kasus2;

import java.util.Scanner;

public class Kasus2 {

    public static void main(String[] args) throws notHexException {
        
        try{
            int i;

            Scanner sc = new Scanner(System.in);

            System.out.println("Masukkan angka hexadesimal");
            String hexadec = sc.next();
            i=Integer.parseInt(hexadec,16);
            System.out.println("Desimal :   " + i);
        }    
        catch(NumberFormatException e){
            try{
            throw new notHexException();
            }
            catch(notHexException ee){
                System.out.println("caught exception " + ee);
            }
        }
        finally{
            System.out.println("angka termasuk hexadesimal");
        } 
 
    }
    
}
