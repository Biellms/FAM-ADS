package polimorfismo;

public class Arara extends Ave{

    // Construtor
    public Arara(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);

    }

    // Métodos
    @Override
    public void print() {
        System.out.println(" -----------------------------------");
        super.print();
        System.out.println();
    }
    
}
