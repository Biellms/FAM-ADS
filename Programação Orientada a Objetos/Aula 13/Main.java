package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        
        Lobo a1 = new Lobo(55.7, 10, 4, "Irineu");

        a1.print();
        a1.emitirSom("AUUUUUUUUUUUUUUUU");

        Cachorro a2 = new Cachorro(16, 1, 4, "Bill");

        a2.print();
        a2.emitirSom("AUAUAUAUAUAUA");
        a2.reagir("agradavel");
        a2.reagir("Vai apanhar");
        a2.reagir(19);
        a2.reagir(15, 16);
        a2.reagir(2, 13);
        a2.reagir(true);
        a2.reagir(false);
    }
}
