package casa;
import java.util.ArrayList;

public class AgenziaImmobiliare {
    private ArrayList<Casa> immobili;
    public AgenziaImmobiliare(){
        immobili = new ArrayList<Casa>();
    }
    public void addImmobiliare(Casa c){
        immobili.add(c);
    }
    public double mediaCosti(double n){
        double tot = 0;
        int cont = 0;
        for (int i = 0; i<immobili.size();i++){
            if (immobili.get(i).superficie>n){
                tot += immobili.get(i).costo();
                cont ++;
            }
        }
        if (cont == 0){
            return 0;
        }else return tot/cont;
    }
}
