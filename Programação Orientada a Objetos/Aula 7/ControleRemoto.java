
package controle;

public class ControleRemoto implements Controlador {
    
    // Atributos
    private int volume = 0;
    private Boolean status = false;
    private Boolean mudo = false;
    private Boolean toque = null;

    // Constructor
    public void ControleRemoto() { 

    }

    // Métodos
    @Override
    public String volume() {
        String v = "";

        if (volume == 0 || mudo == true) {
            return "X";
        } if (volume == 0) {
            return "0";
        } else {
            for (int i = 0; i < volume; i++) {
                v += "|";
            }
        }
        return v;
    }

    @Override
    public String status() {
        if (status == true) {
            return "Ligado";
        } else {
            return "Desligado";
        }
    }

    @Override
    public String mudo() {
        if (mudo == true) {
            return "Ligado";
        } else {
            return "Desligado";
        }
    }

    @Override
    public String toque() {
        if (toque == null) {
            return "Não está tocando";
        } if (toque == false) {
            return "Pausado";
        } else {
            return "Tocando";
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println(" -------------------------------------");
        System.out.println("\t\t MENU");
        System.out.println(" Status: "+status());
        System.out.println(" Volume: "+volume());
        System.out.println(" Mudo: "+mudo());
        System.out.println(" Som: "+toque());
        System.out.println(" -------------------------------------\n");
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
        toque = false;
            System.out.println(" Você desligou o dispositivo!\n");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println(" Menu fechado!");
    }

    @Override
    public void maisVolume() {
        if (status == true) {
            volume++;
            mudo = false;
            System.out.println(" Volume: "+volume()+"\n");
        } else {
            System.out.println(" Ligue o dispositivo para aumentar o volume!\n");
        }
    }

    @Override
    public void menosVolume() {
        if (status == true && volume > 0) {
            volume--;
            mudo = false;
            System.out.println(" Volume: "+volume()+"\n");
        } if (status == true && volume == 0) {
            System.out.println(" O volume está no 0!\n");
        } if (status == false) {
            System.out.println(" Ligue o dispositivo para aumentar o volume!\n");
        }
    }

    @Override
    public void ligarMudo() {
        mudo = true;
        System.out.println(" Mudo ligado!");
        System.out.println(" Volume: "+volume()+"\n");
    }

    @Override
    public void desligarMudo() {
        mudo = false;
        System.out.println(" Mudo desligado!");
        System.out.println(" Volume: "+volume()+"\n");
    }

    @Override
    public void play() {
        toque = true;
    }

    @Override
    public void pause() {
        toque = false;
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

    public Boolean getMudo() {
        return mudo;
    }

    public void setMudo(Boolean mudo) {
        this.mudo = mudo;
    }

    public Boolean getToque() {
        return toque;
    }

    public void setToque(Boolean toque) {
        this.toque = toque;
    }

}
