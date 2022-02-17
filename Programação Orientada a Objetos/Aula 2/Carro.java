package aula2;

public class Carro {
    
    // Atributos
    private String modelo;
    private String cor;
    private int cont;
    private boolean ligado;

    // Construtor
    public Carro (String modelo, String cor, int cont, boolean ligado) {
        this.modelo = modelo;
        this.cor = cor;
        this.cont = cont;
        this.ligado = ligado;
    }

    // Métodos
    public String estado() {
        if (ligado == true) {
            return "Ligado";
        } else {
           return "Desligado";
        }
    }

    public void print() {
        System.out.println("\n --------------------------------");
		System.out.print(" Carro");
		System.out.print("\n Modelo: "+modelo);
		System.out.print("\n Cor: "+cor);
        System.out.printf("\n Estado: "+estado()+"\n Velocidade atual: "+cont);
		System.out.print("\n --------------------------------");
    }

    public void ligar() {
        if (ligado == true) {
            System.out.println("\n O carro já está ligado!");
        } else {
            ligado = true;
            System.out.println("\n Você ligou o carro!");
        }
    }

    public void desligar() {
        if (ligado == false) {
            System.out.println("\n O carro já está desligado!");
        } if (cont > 0) {
            System.out.println("\n O CARRO MORREU POIS ESTAVA EM MOVIMENTO!");
            ligado = false;
            cont = 0;
        } else {
            ligado = false;
            System.out.println("\n Você desligou o carro!");
        }
    }

    public void acelerar() {
        if (ligado == false) {
            System.out.println("\n LIGUE O CARRO PRIMEIRO!");
        } else { 
        System.out.print("\n --------------------------------");
		cont++;
		System.out.print("\n VOCE ACELEROU!");
		System.out.print("\n Velocidade atual: "+cont);
		System.out.print("\n --------------------------------\n");
        }
        
    }

    public void desacelerar() {
        if (cont == 0) {
            System.out.println("\n O carro está parado puxe o FREIO DE MAO!");
        } else {
        System.out.print("\n --------------------------------");
		cont--;
		System.out.print("\n VOCE DESACELEROU!");
		System.out.print("\n Velocidade atual: "+cont);
		System.out.print("\n --------------------------------\n");
        }     
    }

    public void puxarFreioDeMao() {
        if (cont == 0) {
            System.out.println("\n O carro está parado!");
        } else {
            cont = 0;
            System.out.print("\n -----------------------------------------------------");
            System.out.print("\n VOCE CAPOTOU O CARRO POIS ESTAVA EM ALTA VELOCIDADE!");
            System.out.print("\n -----------------------------------------------------\n");
        } 
    }

    // Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
