package dog;

public class Dog {

    // Atributos
    public String nome;
    public String raca;
    private double altura;
    private int peso;
    public Boolean latindo;

    // Constructor
    public Dog(String nome, String raca, double altura, int peso, Boolean latindo) {
        this.nome = nome;
        this.raca = raca;
        this.altura = altura;
        this.peso = peso;
        this.latindo = latindo;
    }

    // Métodos
    public void latir() {
        if(latindo == true) {
            System.out.println(" O "+getNome()+" está latindo! Au...Au...Au!!\n");
        } else {
            System.out.println(" O "+getNome()+" está dormindo!\n");
        }
    }

    public void comecarLatir() {
        if(latindo == true) {
            System.out.println(" O "+getNome()+" está latindo! Au...Au...Au!!\n");
        } else {
            latindo = true;
            System.out.println(" O "+getNome()+" começou a latir! Au...Au...Au!!\n");
        }
    }

    public void pararLatir() {
        if(latindo == false) {
            System.out.println(" O "+getNome()+" já está quieto!\n");
        } else {
            latindo = false;
            System.out.println(" O "+getNome()+" parou de latir!\n");
        }
    }

    public void print() {
        System.out.println(" --------------------------------------------------");
        System.out.println(" Cachorro");
        System.out.println(" Nome: "+getNome());
        System.out.println(" Raça: "+getRaca());
        System.out.println(" Altura: "+getAltura()+"m");
        System.out.println(" Peso: "+getPeso()+"Kg");
        System.out.println(" Status latindo: "+getLatindo()+"\n");
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Boolean getLatindo() {
        return latindo;
    }

    public void setLatindo(Boolean latindo) {
        this.latindo = latindo;
    }

}
