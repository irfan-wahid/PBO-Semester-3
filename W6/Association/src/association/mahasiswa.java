
package association;

class Mahasiswa {
    
    private String name;
    private int NIM;
    private String jurusan;

    Mahasiswa(String name, int NIM, String jurusan){
        this.name = name;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNIM(){
        return this.NIM;
    }
    
    public String getJurusan(){
        return this.jurusan;
    }
}
