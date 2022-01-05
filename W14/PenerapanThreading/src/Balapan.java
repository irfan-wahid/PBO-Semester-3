
public class Balapan extends Thread{
       String nama;

    public Balapan(String id) {
        nama = id;
}

    public void lap() {
        for (int i = 1; i <= 5; i++) {
            if(i<5){
                System.out.println(nama + " berada di lap ke -" + i);
            }else{
                System.out.println(nama + " Telah menyelesaikan balapan");
            }
        }
    }
}
