class MiljovennligBil extends Personbil implements Skattbar, MiljoVennlig {

    private boolean svaneMerke;
    private final int UTSLIPP;
    
    public MiljovennligBil
    (String merke, int moms, int drivstoffKapasitet, double forbruk, boolean svaneMerke, int utslipp) {
        super(merke, moms, drivstoffKapasitet, forbruk);
        this.svaneMerke = svaneMerke;
        this.UTSLIPP = utslipp;
    }

    @Override
    public int utslipp() {
        return kmStand * UTSLIPP;
    }

    @Override
    public boolean svaneMerke() {
        return svaneMerke;
    }
}