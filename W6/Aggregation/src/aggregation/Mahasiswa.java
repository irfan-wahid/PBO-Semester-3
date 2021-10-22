
package aggregation;

public class Mahasiswa {
    
    private String name;
    Kuliah kuliah;
    
    public Mahasiswa(String name, Kuliah klh){
        this.name = name;
        this.kuliah = klh;
    }
    
    public String name(){
        return this.name;
    }
    
    public Kuliah klh(){
        return this.kuliah;
    }
}
