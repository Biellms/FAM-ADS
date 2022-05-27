package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        
        Lobo a1 = new Lobo(55.7, 10, 4, "Irineu");

        a1.print();
        a1.emitirSom("AUUUUUUUUUUUUUUUU");

        Cachorro a2 = new Cachorro(16, 1, 4, "Bill");

        a2.print();
        a2.emitirSom("AUAUAUAUAUAUA");
    }
}
