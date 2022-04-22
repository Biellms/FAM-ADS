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
    public void mudarTrabalho(String trabalho) {
        setor = trabalho;
        System.out.println(" Setor alterado para: "+getSetor());
    }

    public String status() {
        if (trabalhando) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    @Override
    public void print() {
        System.out.println(" ------------------------------------");
        super.print();
        System.out.println(" Setor: "+getSetor());
        System.out.println(" Trabalhando: "+status()+"\n");
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
