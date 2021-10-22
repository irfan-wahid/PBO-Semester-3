
package association;

class Association {
    
    public static void main(String[] args) {
        
        Universitas univ = new Universitas("Padjadjaran");
        Mahasiswa mahasiswa = new Mahasiswa("Udin", 201234567, "Kedokteran");
        
        System.out.println(mahasiswa.getName() + " memiliki NIM " + mahasiswa.getNIM()
        + " kuliah di jurusan " + mahasiswa.getJurusan() + " di universitas " +
        univ.getNamaKampus());
    }
}
