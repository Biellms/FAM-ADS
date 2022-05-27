package polimorfismo2;

public abstract class Mamifero extends Animal{

    protected String nome;
    protected String classe = this.getClass().getSimpleName();

    // Constructor
    public Mamifero(double peso, int idade, int membros, String nome) {
        super(peso, idade, membros);
        this.nome = nome;
    }

    // Métodos
    @Override
    public void emitirSom(String som) {
        System.out.println(" O "+getNome()+" começou a emitir um som:\n "+som+"!");
    }

    @Override
    public void print() {
        System.out.println(" ----------------------------------------------");
        System.out.println(" Nome: "+getNome());
        System.out.println(" Idade: "+getIdade());
        System.out.println(" Peso: "+getPeso());
        System.out.println(" Membros: "+getMembros());
        System.out.println(" Classe: "+classe+"\n");
    }

    // Getters and Setters
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
    
}
