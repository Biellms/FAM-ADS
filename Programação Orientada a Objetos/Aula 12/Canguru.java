package polimorfismo;

public class Canguru extends Mamifero{

    // Constructor
    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);

    }

    // Métodos
    @Override
    public void print() {
        System.out.println(" -----------------------------------");
        super.print();
        System.out.println();
    }

    public void usarBolsa() {
        System.out.println(" Começou a usar a bolsa!");
    }
    
}
