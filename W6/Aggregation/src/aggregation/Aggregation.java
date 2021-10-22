
package aggregation;

public class Aggregation {

    public static void main(String[] args) {
        Kuliah kuliah = new Kuliah(201511052, "Teknik Komputer dan Informatika", "D3 Teknik Informatika");
        Mahasiswa mhs = new Mahasiswa("Muhammad Irfan Noor Wahid", kuliah);
        
        System.out.println("nama : " + mhs.name());
        System.out.println("NIM : " + mhs.kuliah.NIM());
        System.out.println("jurusan : " + mhs.kuliah.jurusan());
        System.out.println("prodi : " + mhs.kuliah.prodi());
    }
    
}
