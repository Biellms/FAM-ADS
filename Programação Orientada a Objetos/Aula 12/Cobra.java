package polimorfismo;

public class Cobra extends Reptil{

    // Construtor
    public Cobra(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);

    }

    // Métodos
    @Override
    public void print() {
        System.out.println(" -----------------------------------");
        super.print();
        System.out.println();
    }
}
