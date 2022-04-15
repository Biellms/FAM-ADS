
package ufc;

public class Lutador {
    
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    
    // Constructor
    public Lutador(String nome, String nacionalidade, String categoria, int idade, int vitorias, int derrotas, int empates, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        setPeso(peso); // Faz com que o atributo seja substituível
    }
    
    // Métodos
    public void apresentar() {
        System.out.println(" Lutador: "+getNome());
        System.out.println(" Origem "+getNacionalidade());
        System.out.println(" Idade: "+getIdade()+" anos");
        System.out.println(" Altura: "+getAltura()+"m");
        System.out.println(" Peso: "+getPeso()+"Kg");
        System.out.println(" Vitórias: "+getVitorias());
        System.out.println(" Derrotas: "+getDerrotas());
        System.out.println(" Empates: "+getEmpates());
    }
    
    public void status() {
        System.out.println(" "+getNome());
        System.out.println(" É um peso "+getCategoria());
        System.out.println(" Com "+getVitorias()+"vitórias");
        System.out.println(" "+getDerrotas()+" derrotas");
        System.out.println(" E "+getEmpates()+" empates");
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates()+ 1);
    }
    
    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso < 52.2) {
            categoria = "Inválido";
        } if (peso <= 70.3) {
            categoria = "Leve";
        } if (peso <= 83.9) {
            categoria = "Médio";
        } if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

}
