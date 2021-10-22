
package dependence;

public class Bonus extends Tabungan {
    
    private int bunga;
    Tabungan tbgn = new Tabungan();
    
    Bonus(int bunga){
        this.bunga = bunga + tbgn.banyakTabungan;
    }
    
    public int getBonus(){
        return this.bunga;
    }
    
}
