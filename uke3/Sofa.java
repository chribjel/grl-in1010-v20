public class Sofa extends Mobel {
    private int antallPlasser;

    public Sofa(int vkt, int dbde, int brdde, int antallPls) {
        super(vkt, dbde, brdde);
        antallPlasser = antallPls;
    }

    public void skrivPlasser() {
        System.out.println("Antall plasser: " + antallPlasser);
    }
}