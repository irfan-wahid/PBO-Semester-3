
package aggregation;

public class Kuliah {
    
    private int NIM;
    private String jurusan;
    private String prodi;
    
    Kuliah(int NIM, String jurusan, String prodi){
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }
    
    public int NIM(){
        return this.NIM;
    }
    
    public String jurusan(){
        return this.jurusan;
    }
    
    public String prodi(){
        return this.prodi;
    }
}
