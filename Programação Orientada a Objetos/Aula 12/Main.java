package polimorfismo;

public class Main {
    
    public static void main(String[] args) {

        // Mamiferos
        Canguru a1 = new Canguru(75.3, 13, 4, "Marrom");
        a1.print();
        a1.locomover("andar pulando");
        a1.alimentar("Big mac");
        a1.usarBolsa();

        Cachorro a2 = new Cachorro(20.1, 3, 4, "Preto");
        a2.print();
        a2.abanarRabo();
        a2.emitirSom("AUAUAU");
        a2.enterrarOsso();
        a2.locomover("correr");

        // Reptil
        Cobra a3 = new Cobra(16.5, 3, 0, "Verde Escuro");
        a3.print();
        a3.emitirSom("SshshHssh");
        a3.locomover("rastejar");
        a3.alimentar("ratos");

        Tartaruga a4 = new Tartaruga(45.3, 67, 4, "Marrom Claro");
        a4.print();
        a4.emitirSom("ahhahhhah");
    }
}
