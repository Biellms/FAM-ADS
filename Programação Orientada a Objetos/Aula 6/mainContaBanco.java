public class mainContaBanco {
    
    public static void main(String[] args) {
        
        // Conta 1
        ContaBanco c1 = new ContaBanco("0001", "CC", "João Silva");

        c1.print();
        c1.abrirConta();
        c1.fecharConta();
        c1.depositar(300);
        c1.sacar(195.5);
        c1.pagarMensal();

        // Conta 2
        ContaBanco c2 = new ContaBanco("0002", "CP", "Maria Silva");
        c2.print();
        c2.abrirConta();
        c2.fecharConta();
        c2.depositar(400);
        c2.sacar(215.2);
        c2.pagarMensal();
    }
}
