public class Mobel {

    protected int vekt;
    protected int dybde;
    protected int bredde;

    public Mobel(int vkt, int dbde, int brdde) {
        vekt = vkt;
        dybde = dbde;
        bredde = brdde;
    }

    public int hentStorrelse() {
        return dybde * bredde;
    }
}