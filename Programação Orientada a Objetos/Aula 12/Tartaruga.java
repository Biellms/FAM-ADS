package polimorfismo;

public class Tartaruga extends Reptil{
    
    // Construtor
    public Tartaruga(double peso, int idade, int membros, String corEscama) {
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
