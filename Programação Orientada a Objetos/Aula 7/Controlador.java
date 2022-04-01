
package controle;

public interface Controlador {

public abstract String volume();
public abstract String status();
public abstract String mudo();
public abstract String toque();
public abstract void ligar();
public abstract void desligar();
public abstract void abrirMenu();
public abstract void fecharMenu();
public abstract void maisVolume();
public abstract void menosVolume();
public abstract void ligarMudo();
public abstract void desligarMudo();
public abstract void play();
public abstract void pause();

}