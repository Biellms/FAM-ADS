
package ufc;

public class Main {

    public static void main(String[] args) {

        Luta ufc = new Luta();
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscritp", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        System.out.println("\n\t######## UFC ######## \n");

        System.out.println(" ----------------------------------------");
        System.out.println(" LUTADORES");
        System.out.println(" ----------------------------------------");
        l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();
        System.out.println(" ----------------------------------------");
        System.out.println(" LUTAS DE HOJE");
        System.out.println(" ----------------------------------------");
        ufc.marcarLuta(l[0], l[1]);
        ufc.lutar();
        System.out.println(" ----------------------------------------");
        ufc.marcarLuta(l[2], l[3]);
        ufc.lutar();
        System.out.println(" ----------------------------------------");
        ufc.marcarLuta(l[4], l[5]);
        ufc.lutar();
        System.out.println(" ----------------------------------------");
        ufc.marcarLuta(l[3], l[5]);
        ufc.lutar();
    }
}
