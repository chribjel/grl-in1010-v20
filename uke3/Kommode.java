public class Kommode extends Mobel {
    private int hoyde;
    private int antallSkuffer;

    public Kommode(int vkt, int dbde, int brdde, int hyde, int antallSkf) {
        super(vkt, dbde, brdde);
        hoyde = hyde;
        antallSkuffer = antallSkf;
    }

    @Override
    public int hentStorrelse() {
        return dybde * bredde * hoyde;
    }

    public void skrivSkuffer() {
        System.out.println("Antall skuffer: " + antallSkuffer);
    }
}