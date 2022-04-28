package herança2;

abstract class Animal {
    
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos
    public void print() {
        System.out.println(" Nome: "+getNome());
        System.out.println(" Idade: "+getIdade());
    }

    public String Falar(String falar) {
        return " O "+nome+" começou a falar: "+falar+"!!";
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
}

