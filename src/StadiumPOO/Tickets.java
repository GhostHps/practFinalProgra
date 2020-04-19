package StadiumPOO;

/**
 * Pojo de los boletos
 */
public class Tickets {
    private static int it = 1;
    private int id;
    private Locality locality;
    private boolean isSold = false;

    public Tickets(Locality locality) {
        this.locality = locality;
        this.isSold = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}
