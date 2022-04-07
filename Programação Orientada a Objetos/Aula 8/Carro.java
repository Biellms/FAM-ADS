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
        ligado = true;
    }

    public void Desligar() {
        ligado = false;
    }

    public void Acelerar() {
        Delta();
    }

    public void passarMarcha() {
        if (marcha < velocidadeMaxima/delta) {
            marcha += 1;
            System.out.println(" Passou de marcha!\n Marcha Atual: "+getMarcha());
        } else {
            System.out.println(" Já está na ultima marcha!\n Marcha Atual: "+getMarcha());
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

    public void print() {
        System.out.println("\n -------------------------------------------");
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
