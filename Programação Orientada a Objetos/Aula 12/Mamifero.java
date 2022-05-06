package polimorfismo;

public abstract class Mamifero extends Animal{

    // Atributos
    private String corPelo;

    // Construtor
    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Cor pelo: "+getCorPelo()); 
    }

    // Getters and Setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
