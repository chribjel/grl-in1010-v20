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


    public boolean equals(Rektangel rekt) {
        boolean len = this.lengde == rekt.hentLengde();
        boolean bred = this.bredde == rekt.hentBredde();
        return len && bred;
    }

    @Override
    public String toString() {
        return "Rektangel";
    }
}