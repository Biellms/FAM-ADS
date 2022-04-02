
package controle;

public class mainControle {

    public static void main(String[] args) {
        
        ControleRemoto c1 = new ControleRemoto();

        c1.abrirMenu();
        c1.ligar();
        c1.maisVolume();
        c1.maisVolume();
        c1.maisVolume();
        c1.maisVolume();
        c1.menosVolume();
        c1.mudo();
        c1.desligarMudo();
        c1.play();
        c1.pause();
        c1.desligar();
        c1.abrirMenu();
        c1.fecharMenu();
        
    }
  
}
