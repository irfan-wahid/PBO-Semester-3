
package rikudo;

public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;

    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }

    void printDojutsu() {
        System.out.println(this.Dojutsu);
        setDojutsu();//mengisi nilai variabel this.Dojutsu menjadi "Mengekyou Sharingan"
        System.out.println(this.Dojutsu);
    }

    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
}
