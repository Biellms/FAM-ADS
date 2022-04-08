package carro;

public class Carro {

    // Atributos    
    private int marcha;
    private Boolean ligado;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private double delta;

    // Constructor
    public Carro(int marcha, Boolean ligado, double velocidadeAtual, double velocidadeMaxima, double delta) {
        this.marcha = marcha;
        this.ligado = ligado;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.delta = delta;
    }

    // Métodos
    public void Ligar() {
        if (ligado) {
            System.out.println(" O carro já está ligado!");
        } else {
            System.out.println(" Carro ligado!");
            ligado = true;
        }
    }

    public void Desligar() {
        if (velocidadeAtual > 0) {
            System.out.println(" Você não pode desligar o carro em movimento!");
        } else {
            if (ligado) {
                ligado = false;
                System.out.println(" Carro desligado!");
            } else {
                System.out.println(" Carro já está desligado!");
            }
        }
    }

    public void Acelerar() {
        if (ligado == true) {
            if (velocidadeAtual == velocidadeMaxima) { 
                System.out.println(" Atingiu a velocidade máxima!");
            } else {
                if (Controle() == false) {
                    System.out.println(" Passe a marcha para acelerar mais!");
                } else { 
                    Delta();
                }
            } 
        } else {
            System.out.println(" Ligue o carro primeiro");
        }
    }

    public void Desacelerar() {
        if (ligado == true) {
            if (velocidadeAtual <= 0) { 
                System.out.println(" O carro está parado!\n Velocidade: "+getVelocidadeAtual()+"Km/h");
            } else {
                velocidadeAtual -= delta;
                System.out.println(" Desacelerou!\n Velocidade: "+getVelocidadeAtual()+"Km/h");
            } 
        } else {
            System.out.println(" Ligue o carro primeiro");
        }
    }

    public void passarMarcha() {
        if (marcha < velocidadeMaxima/delta) {
            marcha += 1;
            System.out.println(" Passou de marcha!\n Marcha Atual: "+getMarcha());
        } else {
            System.out.println(" Está na ultima marcha!\n Marcha Atual: "+getMarcha());
        }
    }

    public void descerMarcha() {
        if (marcha > 0) {
            marcha -= 1;
            System.out.println(" Desceu de marcha!\n Marcha Atual: "+getMarcha());
        } else {
            System.out.println(" Está no ponto morto!\n Marcha Atual: "+getMarcha());
        }
    }

    public void Delta() {
        if (velocidadeAtual + delta <= velocidadeMaxima) {
            velocidadeAtual += delta;
            System.out.println(" Acelerou!\n Velocidade: "+getVelocidadeAtual()+"Km/h");
        } else {
            velocidadeAtual = velocidadeMaxima;
            System.out.println(" Já está na velocidade máxima!\n Velocidade: "+getVelocidadeAtual()+"Km/h");
        }
    }

    public Boolean Controle() {
        double controle = delta*marcha;

        if (velocidadeAtual < controle) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println(" -------------------------------------------");
        System.out.println(" Marcha atual: "+marcha);
        System.out.println(" Ligado: "+ligado);
        System.out.println(" Velocidade Atual: "+velocidadeAtual);
        System.out.println(" velocidadeMaxima: "+velocidadeMaxima);
        System.out.println(" -------------------------------------------");
    }

    // Getters and Setters
    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

}
