package carro;

import java.util.*;

public class mainCarro {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int op;

        Carro celtaDuasPorta = new Carro(0,false,0,240,40);

        celtaDuasPorta.print();

        do {
            System.out.print("\n Escolha uma opção");	
            System.out.print("\n 1) Ligar");	
            System.out.print("\n 2) Desligar");
            System.out.print("\n 3) Acelerar");
            // System.out.print("\n 4) Desacelerar");
            System.out.print("\n 4) Passar Marcha");
            System.out.print("\n 5) Informações");
            System.out.print("\n 6) Sair");
            System.out.print("\n Opção: "); op = ler.nextInt();
            System.out.println("");
    
                switch (op) {
                    case 1: celtaDuasPorta.Ligar(); break;
                    case 2: celtaDuasPorta.Desligar(); break;
                    case 3: celtaDuasPorta.Acelerar(); break;
                    // case 4: celtaDuasPorta.desacelerar(); break;
                    case 4: celtaDuasPorta.passarMarcha(); break;
                    case 5: celtaDuasPorta.print(); break;
                    case 6: System.out.println(" Saindo...\n"); System.exit(0); break;
                    default: System.out.println("\n VALOR INCORRETO!"); break;
                }
    
            } while (op != 7);
    
            ler.close();
    }
}
