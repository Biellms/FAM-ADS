package carro;

import java.util.*;

public class mainCarro {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int op;

        Carro celtaDuasPortas = new Carro(0,false,0,240,40);

        celtaDuasPortas.print();

        do {
            System.out.print("\n Escolha uma opção");	
            System.out.print("\n 1) Ligar");	
            System.out.print("\n 2) Desligar");
            System.out.print("\n 3) Acelerar");
            System.out.print("\n 4) Desacelerar");
            System.out.print("\n 5) Passar Marcha");
            System.out.print("\n 6) Descer Marcha");
            System.out.print("\n 7) Informações");
            System.out.print("\n 8) Sair");
            System.out.print("\n Opção: "); op = ler.nextInt();
            System.out.println("");
    
                switch (op) {
                    case 1: celtaDuasPortas.Ligar(); break;
                    case 2: celtaDuasPortas.Desligar(); break;
                    case 3: celtaDuasPortas.Acelerar(); break;
                    case 4: celtaDuasPortas.Desacelerar(); break;
                    case 5: celtaDuasPortas.passarMarcha(); break;
                    case 6: celtaDuasPortas.descerMarcha(); break;
                    case 7: celtaDuasPortas.print(); break;
                    case 8: System.out.println(" Saindo...\n"); System.exit(0); break;
                    default: System.out.println("\n VALOR INCORRETO!"); break;
                }
    
            } while (op != 7);
    
            ler.close();
    }
}
