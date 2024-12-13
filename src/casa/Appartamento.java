package casa;

public class Appartamento extends Casa {
    protected int codiceEnergetico;

    public int getCodiceEnergetico() {
        return codiceEnergetico;
    }

    public void setCodiceEnergetico(int codiceEnergetico) {
        this.codiceEnergetico = codiceEnergetico;
    }

    public Appartamento(int nStanze, double superficie, int codiceEnergetico) {
        super(nStanze, superficie);
        setCodiceEnergetico(codiceEnergetico);
    }

    public double costo() {
        return (super.getSuperficie() * 1500) + (super.getNStanze() * codiceEnergetico);
    }
}