public class Hovedprogram {
    public static void main(String[] args) {
        Mobel m = new Mobel(10, 20, 30);
        Sofa s = new Sofa(20, 50, 70, 4);
        Kommode k = new Kommode(20, 20, 30, 80, 5);

        m = new Sofa(20, 60, 70, 4);

        s.skrivPlasser();

        System.out.println(m.hentStorrelse());
        // s.skrivPlasser();
        // System.out.println(k.hentStorrelse());
        // k.skrivSkuffer();

    }
}