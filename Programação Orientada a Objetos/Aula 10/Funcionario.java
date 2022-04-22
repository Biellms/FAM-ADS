package herança;

public class Funcionario extends Pessoa{
    
    // Atributos
    private String setor;
    private Boolean trabalhando;

    // Construtor
    public Funcionario(String nome, int idade, String sexo, String setor, Boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    // Métodos
    public void mudarTrabalho() {
        
    }

    //Getters and Setters
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public Boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
