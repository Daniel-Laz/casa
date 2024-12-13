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

}
