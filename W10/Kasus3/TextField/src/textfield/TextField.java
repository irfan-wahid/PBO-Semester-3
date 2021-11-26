
package textfield;

import java.util.Scanner;

public class TextField {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            System.out.println(a);
       }
        catch(Exception e){
           System.out.println("Hanya boleh diisi integer");
        }
    }
    
}
