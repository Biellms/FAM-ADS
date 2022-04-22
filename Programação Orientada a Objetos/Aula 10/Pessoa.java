package herança;

public class Pessoa {

    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos
    public void fazerAniv(int valor) {
        idade =+ valor;
        System.out.println(" Feliz Aniversário! idade atual: "+getIdade()+"");
    }

    public void print() {
        System.out.println(" Nome: "+getNome());
        System.out.println(" Idade: "+getIdade());
        System.out.println(" Sexo: "+getSexo());
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}