package herança;

public class Main {
    public static void main(String[] args) {
        
        Aluno p1 = new Aluno("Gabriel", 20, "Masculino", 150625, "ADS");
        p1.print();
        p1.cancelarMatricula();
        p1.fazerAniv();

        Funcionario p2 = new Funcionario("Bruna", 31, "Feminino", "Bradesco Seguros", true);
        p2.print();
        p2.mudarTrabalho("Bradesco Saúde");
        p2.fazerAniv();

        Professor p3 = new Professor("Albert Einstein", 55, "Masculino", "Físico Teórico", 12.899);
        p3.print();
        p3.receberAumento(2.310);
        p3.fazerAniv();

    }
}
