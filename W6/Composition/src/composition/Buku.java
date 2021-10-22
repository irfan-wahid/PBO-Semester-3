
package composition;

public class Buku {
    
    private String book;
    private Person person;
    
    Buku(String book, Person person){
        this.book = book;
        this.person = person;
    }
    
    public String getbook(){
        return this.book;
    }
    
    public Person person(){
        return this.person;
    }
    
}
