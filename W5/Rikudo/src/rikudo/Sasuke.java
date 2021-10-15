
package rikudo;

public class Sasuke extends Itachi{
    String Dojutsu = "Sharingan";
    
    void printDojutsu(){
        super.printDojutsu();//mengisi nilai this.Dojutsu dengan nilai dari superclass yaitu class Itachi
        System.out.println(this.Dojutsu);
    }
}
