public class ContaBanco {
    
    // Atributos
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private Boolean status;

    // Constructor
    public ContaBanco(String numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;

        saldo = 0;
        status = false;
    }

    // Métodos
    public void abrirConta() {
        if (status == true) {
            System.out.println(" A conta já está aberta!\n");
        } else {
            status = true;
            if (tipo == "CC") {
                saldo = saldo + 50;
            } else {
                saldo = saldo + 150;
            }
            System.out.println(" A conta "+getNumConta()+"-"+getTipo()+" foi aberta com sucesso!\n"
            + " Saldo: $"+getSaldo()+"\n");
        }
    }

    public void fecharConta() {
        if (status == false) {
            System.out.println(" A conta já está fechada!\n");
        } else {
            if (saldo > 0 ) {
                System.out.println(" A conta "+getNumConta()+"-"+getTipo()+" não pode ser fechada."
                + "\n Pois está com o saldo positivo de: $"+getSaldo()
                + "\n Saque todo o dinheiro para fecha-la!\n");
            } 
            
            if (saldo < 0 ) {
                System.out.println(" A conta "+getNumConta()+"-"+getTipo()+" não pode ser fechada."
                + "\n Pois está com o saldo neativo de: $"+getSaldo()
                + "\n Pague a divida para fecha-la!\n");
            } 
            
            if (saldo == 0) {
                status = false;
                System.out.println(" A conta "+getNumConta()+"-"+getTipo()+" foi fechada!\n");
            }
        }
    }

    public void depositar(double valor) {
        if (status == true) {
            saldo = saldo + valor;
            System.out.println(" Depósito de: $"+valor+" efetuado com sucesso!\n"
            + " Saldo: $"+getSaldo()+"\n");
        } else {
            System.out.println(" A conta deve estar aberta para efetuar um depósito!\n");
        }
    }

    public void sacar(double valor) {
        if (status == true) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println(" Saque de: $"+valor+" efetuado com sucesso!\n"
                + " Saldo: $"+getSaldo()+"\n");
            } else {
                System.out.println(" Saldo insuficiente!\n");
            }
        } else {
            System.out.println(" A conta deve estar aberta e com saldo positivo para efetuar um saque!\n");
        }
    }

    public void pagarMensal() {
        double valor;

        if (saldo >= 12) {
            if (tipo == "CC") {
                valor = 12;
                saldo = saldo - valor;
            } else {
                valor = 20;
                saldo = saldo - valor;
            }
            System.out.println(" Pagamento mensal de: $"+valor+" efetuado com sucesso!\n"
            + " Saldo: $"+getSaldo()+"\n");
        } else {
            System.out.println(" Saldo insuficiente!\n");
        }
            
    }

    public void print() {
        System.out.println(" -----------------------------------------------");
        System.out.println(" Número da conta: "+getNumConta());
        System.out.println(" Tipo: "+getTipo());
        System.out.println(" Dono: "+getDono());
        System.out.println(" Saldo: "+getSaldo());
        System.out.println(" Status: "+status());
        System.out.println(" -----------------------------------------------\n");
    }

    public String status() {
        if (status == true) {
            return "Aberta";
        } else {
            return "Fechada";
        }
    }

    // Getters and Setters
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
