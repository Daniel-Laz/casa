package casa;

public class Villa extends Casa{
    protected boolean piscina;

    public Villa(int nStanze, double superficie, boolean piscina){
        super(nStanze,superficie);
        setPiscina(piscina);
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public double costo() {
        int p=0;
        int s=0;
        if (piscina){
            p=20000;
        }
        if (super.getNStanze()>=0){
            s = 10000;
        }
        return (super.getSuperficie()*2000)+p+s;
    }
}
