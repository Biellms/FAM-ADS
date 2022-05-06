public abstract class Animal {

    // Atibutos
    private double peso;
    private int idade;
    private int membros;
    public String nome = this.getClass().getSimpleName();

    // Construtor
    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    // Métodos
    public void locomover(String locomocao) {
        System.out.println(" Começou a "+locomocao+"!");
    }

    public void alimentar(String alimento) {
        System.out.println(" Começou a comer "+alimento+"!");
    }

    public void emitirSom(String som) {
        System.out.println(" Começou a emitir um som: "+som+"!");
    }   

    public void print() {
        System.out.println(" "+nome);
        System.out.println(" Peso: "+getPeso()+"Kg");
        System.out.println(" Idade: "+getIdade()+" anos");
        System.out.println(" Possui: "+getMembros()+" membros");
    }

    // Getters and Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
