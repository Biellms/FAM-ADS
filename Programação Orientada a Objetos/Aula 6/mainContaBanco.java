public class mainContaBanco {
    
    public static void main(String[] args) {
        
        // Conta 1
        ContaBanco c1 = new ContaBanco("0001", "CC", "João Silva");

        c1.print();
        c1.abrirConta();
        c1.print();
        c1.fecharConta();

        // Conta 2
        // ContaBanco c2 = new ContaBanco("0002", "CP", "Maria Silva");
    }
}
