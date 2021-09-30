
package berhitung;

import java.util.Scanner;

public class Berhitung {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        //menggunakan double agar pada saat pembagian, angka di belakang koma tidak selalu 0
        double a = sc.nextInt();
        
        //charAt berfungsi untuk mengambil index ke n pada string
        char operator = sc.next().charAt(0);
        
        double b = sc.nextInt();
        
        double pertambahan  = a+b;
        double pengurangan  = a-b;
        double perkalian  = a*b;
        double pembagian  = a/b;
        double modulo = a%b;
        
        switch(operator){
            case '+':{
                System.out.println(pertambahan);
                break;
            }
            case '-':{
                System.out.println(pengurangan);
                break;
            } 
            case '*':{
                System.out.println(perkalian);
                break;
            }    
            case '/':{
                System.out.println(pembagian);
                break;
            }
            case '%':{
                System.out.println(modulo);
                break;
            }            
            default:{
                System.out.println("Masukan operator yang benar");
                break;
            }
        }
        
    }
    
}
