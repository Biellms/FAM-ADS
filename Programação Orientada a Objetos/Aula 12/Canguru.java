public class Canguru extends Mamifero{

    // Constructor
    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);

    }

    @Override
    public void print() {
        System.out.println(" -----------------------------------");
        super.print();
        System.out.println("");
    }

    // Métodos
    public void usarBolsa() {
        System.out.println(" Começou a usar a bolsa!");
    }
    
}
