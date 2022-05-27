package polimorfismo2;

public class Cachorro extends Lobo{

    // Constructor
    public Cachorro(double peso, int idade, int membros, String nome) {
        super(peso, idade, membros, nome);
    }
    
    // Métodos
    @Override
    public void emitirSom(String som) {
        super.emitirSom(som);
    }

    @Override
    public void print() {
        super.print();
    }

}
