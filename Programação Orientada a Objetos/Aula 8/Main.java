package trapezio;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Trapezio t1 = new Trapezio();

        System.out.println("\n ÁREA DO TRAPÉZIO\n");
        System.out.print(" Base Maior: "); t1.setB(ler.nextInt());
        System.out.print(" Base Menor: "); t1.setC(ler.nextInt());
        System.out.print(" Altura: "); t1.setD(ler.nextInt());

        ler.close();

        System.out.print("\n VALOR DA ÁREA: "+t1.Area());

    }
}
