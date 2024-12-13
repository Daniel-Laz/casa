package casa;

public class Test {
    public static void main(String[] args) {
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();
        agenzia.addImmobiliare(new Appartamento(3, 100, 32));
        agenzia.addImmobiliare(new Villa(15, 1000, true));
        System.out.println(agenzia.mediaCosti(500));
    }
}
