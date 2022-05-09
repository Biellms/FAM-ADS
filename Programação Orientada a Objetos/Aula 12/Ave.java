package polimorfismo;

public abstract class Ave extends Animal{
    
    // Atributos
    private String corPelo;

    // Construtor
    public Ave(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    // Métodos
    public void fazerNinho() {
        System.out.println(" Começou a fazer um ninho!");
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
