public class Main {
    
    public static void main(String[] args) {
        
        Canguru a1 = new Canguru(75.3, 13, 4, "Marrom");

        a1.print();
        a1.locomover("andar pulando");
        a1.alimentar("Big mac");
        a1.usarBolsa();

        Cachorro a2 = new Cachorro(20.1, 3, 4, "Preto");

        a2.print();
        a2.abanarRabo();
        a2.alimentar("Ração");
        a2.enterrarOsso();
        a2.locomover("correr");
    }
}
