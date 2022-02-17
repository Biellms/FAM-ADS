package aula2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        Carro c1 = new Carro("Celta duas portas","Vermelho",0,false);

        int op;

        c1.print();

        do {
        System.out.print("\n Escolha uma opção");	
        System.out.print("\n 1) Ligar");	
        System.out.print("\n 2) Desligar");
        System.out.print("\n 3) Acelerar");
        System.out.print("\n 4) Desacelerar");
        System.out.print("\n 5) Puxar freio de mão");
        System.out.print("\n 6) Informações");
        System.out.print("\n 7) Sair");
        System.out.print("\n Opção: "); op = leia.nextInt();

            switch (op) {
                case 1: c1.ligar(); break;
                case 2: c1.desligar(); break;
                case 3: c1.acelerar(); break;
                case 4: c1.desacelerar(); break;
                case 5: c1.puxarFreioDeMao(); break;
                case 6: c1.print(); break;
                case 7: System.out.println("\n saindo..."); break;
                default: System.out.println("\n VALOR INCORRETO!"); break;
            }

        } while (op != 7);

        leia.close();
    }

}
