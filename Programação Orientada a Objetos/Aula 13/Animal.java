package polimorfismo2;

public abstract class Animal {
    
    // Atributos protegidos
    protected double peso;
    protected int idade;
    protected int membros;

    // Constructor
    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    // Métodos abstrato
    public abstract void emitirSom(String som);
    public abstract void print();

    // Getters and Setters
    public double getPeso() { return peso; }

    public void setPeso(double peso) { this.peso = peso; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public int getMembros() { return membros; }

    public void setMembros(int membros) { this.membros = membros; }

}
