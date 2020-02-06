public class Kvadrat extends Rektangel {

    public Kvadrat(int lengde) {
        super(lengde, lengde);
    }

    @Override
    public int areal() {
        return lengde * lengde;
    }

    public int areal(int tall) {
        
    }
}