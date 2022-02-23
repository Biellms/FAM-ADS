// Gabriel Mendes 00250615 4º ADS - Noturno

package caneta;

public class mainCaneta {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();

        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 75;
        c1.destampar();
        c1.print();
        c1.estado();

        Caneta c2 = new Caneta();

        c2.modelo = "Lux";
        c2.cor = "Preto";
        c2.ponta = 0.7;
        c2.carga = 80;
        c2.tampar();
        c2.print();
        c2.estado();

        Caneta c3 = new Caneta();

        c3.modelo = "Lux";
        c3.cor = "Vermelho";
        c3.ponta = 0.5;
        c3.carga = 90;
        c3.destampar();
        c3.print();
        c3.estado();

        Caneta c4 = new Caneta();

        c4.modelo = "Bic";
        c4.cor = "Verde";
        c4.ponta = 0.7;
        c4.carga = 98;
        c4.tampar();
        c4.print();
        c4.estado();
    }
}
