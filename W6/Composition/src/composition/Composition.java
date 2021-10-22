
package composition;

public class Composition {

    public static void main(String[] args) {
        
        Person a = new Person("Pidi Baiq");
        Buku b = new Buku("Dilan", a);
        
        System.out.println(b.getbook() + b.person().getName());
    }
    
}
