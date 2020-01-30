class Referanser {
    public static void main(String[] args) {
        Kaningaard kg = new Kaningaard();
        kg.leggTilKanin();
        kg.leggTilKanin();
        Kaningaard kg2 = kg;
        kg.leggTilKanin();
        kg2.fjernKanin();
        kg2.fjernKanin();
        System.out.println(kg.antall);
        System.out.println(kg2.antall);
    }
}

