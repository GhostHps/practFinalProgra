package vineyard;

import java.util.ArrayList;

public class Vine {
    private ArrayList<Barrel> lpy = new ArrayList<Barrel>();
    private int yearsAway = 0;

    public Vine() {
    }

    public ArrayList<Barrel> getLpy() {
        return lpy;
    }

    public void setLpy(ArrayList<Barrel> lpy) {
        this.lpy = lpy;
    }

    public void lpyPlus(double quant) {
        this.lpy.add(new Barrel(quant));
        this.yearsAway++;
    }

    public int getYearsAway() {
        return yearsAway;
    }

    public void yearsAwayPlus() {
        this.yearsAway++;
    }
}
