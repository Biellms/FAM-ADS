package polimorfismo;

public abstract class Peixe extends Animal{

    // Atributos
    private String corEscama;

    // Construtor
    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;

    }

    // Métodos
    public void soltarBolha() {
        System.out.println(" Começou a soltar bolhas!");
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
