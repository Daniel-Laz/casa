package casa;

public abstract class Casa {
    protected int nStanze;
    protected double superficie;

    public Casa(int nStanze, double superficie){
        setNStanze(nStanze);
        setSuperficie(superficie);
    }

    public void setNStanze(int nStanze) {
        if (nStanze < 0){
            nStanze = 0;
        }
        this.nStanze = nStanze;
    }
    public void setSuperficie(double superficie){
        if (superficie < 0){
            superficie = 0;
        }
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getNStanze() {
        return nStanze;
    }
    public abstract double costo();
}