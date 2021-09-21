package datatypes;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int angka = keyboard.nextInt();
        
        for (int i=0; i<angka; i++){
            
            long x = keyboard.nextLong();
            System.out.println(x+" Can be fitted in");
            
            if(x>=-128 && x<= 127){
                System.out.println("* byte");
            }
            
            if(x>=-32768 && x<= 32767){
                System.out.println("* short");
            }
            
            if(x>=-2147483648 && x<= 2147483647){
                System.out.println("* integer");
            }
            
            if(x>=-9223372036854775808L && x<= 9223372036854775807L){
                System.out.println("* long");
            }else{
                System.out.println(x+" Can't be fitted anywhere");
             }
        }
    }
    
}
