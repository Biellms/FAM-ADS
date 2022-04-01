public class ControleRemoto implements Controlador {
    
    // Atributos
    private int volume = 12;
    private Boolean status = false;

    // Constructor
    public void ControleRemoto() { 
        
    }


    // Métodos
    public String volume() {
        String v = "";
        for (int i = 0; i < volume; i++) {
                v += "|";
            }
        return v;
    }


    @Override
    public void ligar() {
        if (status == true) {
            System.out.println(" O dispositivo já está ligado\n");    
        } else {
        status = true;
            System.out.println(" Você ligou o dispositivo\n");
        }
    }

    @Override
    public void desligar() {
        if (status == false) {
            System.out.println(" O dispositivo já está desligado\n");    
        } else {
        status = false;
            System.out.println(" Você desligou o dispositivo\n");
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println(" -----------------------------------");
        System.out.println(" Menu");
        System.out.println(" Status: "+status);
        System.out.println(" Volume: "+volume());
        System.out.println(" -----------------------------------\n");
    }

    @Override
    public void fecharMenu(){
        System.out.println(" Menu fechado!");
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
