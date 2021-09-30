
package inputoutput;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        //fungsi split digunakan untuk mengambil nilai yang terdapat pada variabel string
        String[] strings = s.split("['!?,._@ ]+");
        System.out.println(strings.length);
        for (String str : strings)
        System.out.println(str);
    }
    
}
