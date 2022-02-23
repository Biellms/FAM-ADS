// Gabriel Mendes 00250615 4º ADS - Noturno

package caneta;

public class Caneta {
    
    String modelo;
    String cor;
    double ponta;
    int carga;
    Boolean tampado;

    public void print() {
        System.out.println("Modelo : "+modelo);
        System.out.println("Cor : "+cor);
        System.out.println("Ponta : "+ponta);
        System.out.println("Carga : "+carga+"%");
        System.out.println("Tampado : "+tampado);
    }

    public void estado() {
        if (tampado == true) {
            System.out.println("Está tampado e não pode Rabiscar!\n");
        } else {
            System.out.println("Rabiscando...\n");
        }
    } 

    public Boolean tampar() {
        return tampado = true;
    }

    public Boolean destampar() {
        return tampado = false;
    }

}
