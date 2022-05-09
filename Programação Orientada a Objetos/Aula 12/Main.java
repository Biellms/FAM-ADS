package polimorfismo;

public class Main {
    
    public static void main(String[] args) {

        // Mamifero
        Canguru a1 = new Canguru(75.3, 13, 4, "Marrom");
        a1.print();
        a1.usarBolsa();
        a1.locomover("andar pulando");
        a1.alimentar("Big mac");

        Cachorro a2 = new Cachorro(20.1, 3, 4, "Preto");
        a2.print();
        a2.abanarRabo();
        a2.enterrarOsso();
        a2.emitirSom("AUAUAU");
        a2.locomover("correr");

        // Reptil
        Cobra a3 = new Cobra(16.5, 3, 0, "Verde Escuro");
        a3.print();
        a3.emitirSom("SshshHssh");
        a3.locomover("rastejar");

        Tartaruga a4 = new Tartaruga(45.3, 67, 4, "Marrom Claro");
        a4.print();
        a4.locomover("andar");
        a4.alimentar("folhas");

        // Peixe
        Goldfish a5 = new Goldfish(0.243, 1, 0, "Dourada");
        a5.print();
        a5.soltarBolha();
        a5.locomover("nadar");

        // Ave
        Arara a6 = new Arara(16.5, 6, 2, "Azul");
        a6.print();
        a6.fazerNinho();
        a6.locomover("voar");
        a6.alimentar("minhocas");
    }
}
