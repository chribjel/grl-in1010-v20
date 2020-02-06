public class Rektangel extends Form{
    protected int lengde;
    private int bredde;

    public Rektangel(int lengde, int bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }

    public int hentBredde() {
        return bredde;
    }
    public int hentLengde() {
        return lengde;
    }

    @Override
    public int areal() {
        return lengde * bredde;
    }


    // For å kunne override denne metoden må man ta inn Object som paramenter
    // og da må man først sjekke om objektet man tar inn er av samme type
    // og deretter caste
    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Rektangel)) { return false; }
        Rektangel r = (Rektangel) o;
        boolean len = len == o.len;
        boolean bred = bred == o.bred;
        return len && bred;
    }

    @Override
    public String toString() {
        return "Rektangel";
    }
}