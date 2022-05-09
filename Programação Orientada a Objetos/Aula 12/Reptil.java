package polimorfismo;

public abstract class Reptil extends Animal{

    // Atributo
    private String corEscama;

    // Construtor
    public Reptil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Cor escama: "+getCorEscama());
    }

    // Getters and Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
