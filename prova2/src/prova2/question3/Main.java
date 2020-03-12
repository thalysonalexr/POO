package prova2.question3;

public class Main {
    public static void main(String[] args) {
        EletronicoRep eletronicoRep = new EletronicoRep();
        Menu<Eletronico> menuEletronico = new Menu(eletronicoRep);
        menuEletronico.executar();
    }
}
