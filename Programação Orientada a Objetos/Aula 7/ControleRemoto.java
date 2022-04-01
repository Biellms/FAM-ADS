
package controle;

public class ControleRemoto implements Controlador {
    
    // Atributos
    private int volume = 0;
    private Boolean status = false;

    // Constructor
    public void ControleRemoto() { 
        
    }

    // Métodos
    public String volume() {
        String v = "";
        if (volume == 0) {
            return "mudo";
        }
        for (int i = 0; i < volume; i++) {
                v += "|";
            }
        return v;
    }

    public String status() {
        if (status == true) {
            return "Ligado";
        } else {
            return "Desligado";
        }
    }

    @Override
    public void ligar() {
        if (status == true) {
            System.out.println(" O dispositivo já está ligado!\n");    
        } else {
        status = true;
            System.out.println(" Você ligou o dispositivo!\n");
        }
    }

    @Override
    public void desligar() {
        if (status == false) {
            System.out.println(" O dispositivo já está desligado!\n");    
        } else {
        status = false;
            System.out.println(" Você desligou o dispositivo!\n");
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println(" -------------------------------------");
        System.out.println("\t\t MENU");
        System.out.println(" Status: "+status());
        System.out.println(" Volume: "+volume());
        System.out.println(" -------------------------------------\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println(" Menu fechado!");
    }

    @Override
    public void maisVolume() {
        if (status == true) {
            volume++;
            System.out.println(" Volume: "+volume()+"\n");
        } else {
            System.out.println(" Ligue o dispositivo para aumentar o volume!\n");
        }
    }

    @Override
    public void menosVolume() {
        if (status == true && volume > 0) {
            volume--;
            System.out.println(" Volume: "+volume()+"\n");
        } if (status == true && volume == 0) {
            System.out.println(" O volume está no 0!\n");
        } if (status == false) {
            System.out.println(" Ligue o dispositivo para aumentar o volume!\n");
        }
    }

    @Override
    public void ligarMudo() {
        volume = 0;
        System.out.println(" Mudo ligado!");
        System.out.println(" Volume: "+volume()+"\n");
    }

    @Override
    public void desligarMudo() {
        System.out.println(" Mudo desligado!\n");
    }

    // Getters and Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
