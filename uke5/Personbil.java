class Personbil extends Bil implements Skattbar {

    protected String merke;
    protected int momsSats;
    protected final int MAX_DRIVSTOFF;
    protected double tank = 0;
    protected int kmStand = 0;
    protected final double FORBRUK;
    protected int verdi = 50000;
    
    public Personbil(String merke, int moms, int drivstoffKapasitet, double forbruk) {
        this.merke = merke;
        this.momsSats = moms;
        this.MAX_DRIVSTOFF = drivstoffKapasitet;
        this.FORBRUK = forbruk;
    }

    @Override
    void kjor(double km) {
        if (tank >= FORBRUK*km) {
            kmStand += km;
            tank -= FORBRUK*km;
        } else {
            km = tank/FORBRUK;
            kmStand += km;
            tank = 0;
        }
    }

    @Override
    void fyllPaBensin(int bensin) {
        if (MAX_DRIVSTOFF >= tank + bensin)
            tank += bensin;
        else
            tank = MAX_DRIVSTOFF;
    }

    @Override
    public double toll() {
        return verdi * momsSats;
    }

    @Override
    public int momsSats() {
        return momsSats;
    }
}