package herança;

public class Professor extends Pessoa{
    
    // Atributos
    private String especialidade;
    private double salario;

    // Construtor
    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    // Métodos
    public void receberAumento(double valor) {
        salario += valor;
        System.out.println(" Salário aumentado para: $"+getSalario());
    }

    // Getters and Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
