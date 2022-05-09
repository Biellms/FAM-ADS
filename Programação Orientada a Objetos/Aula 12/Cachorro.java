package polimorfismo;

public class Cachorro extends Mamifero{

    // Constructor
    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);

    }

    // Métodos
    @Override
    public void print() {
        System.out.println(" -----------------------------------");
        super.print();
        System.out.println();
    }

    public void enterrarOsso() {
        System.out.println(" Começou a enterrar o osso!");
    }

    public void abanarRabo() {
        System.out.println(" Começou a abanar o rabo!");
    }
}
