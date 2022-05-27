package polimorfismo2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Cachorro extends Lobo{

    // Constructor
    public Cachorro(double peso, int idade, int membros, String nome) {
        super(peso, idade, membros, nome);
    }
    
    // Métodos
    @Override
    public void emitirSom(String som) {
        super.emitirSom(som);
    }

    @Override
    public void print() {
        super.print();
    }

    //Sobrecarga
    public void reagir(String a) {
        if (a == "agradavel") {
            System.out.println(" "+getNome()+" começou a abanar o rabo e latir!");
        } else {
            System.out.println(" "+getNome()+" começou a rosnar!");
        }
    }

    public void reagir(int a) {
        if (a <= 12) {
            System.out.println(" "+getNome()+" está abanando o rabo!");
        } if (a >= 18) {
            System.out.println(" "+getNome()+" está ignorando!");
        } else {
            System.out.println(" "+getNome()+" está abanando o rabo e latindo!");
        }
    }

    public void reagir(boolean a) {
        if (a) {
            System.out.println(" "+getNome()+" está feliz!");
        } else {
            System.out.println(" "+getNome()+" começou a rosnar e latir!");
        }
    }

    public void reagir(int idade, double peso) {
        if (idade >=  10) {
            if (peso >= 15) {
                System.out.println(" "+getNome()+" está velho e acima do peso!");
            } else {
                System.out.println(" "+getNome()+" é um cachorro velho!");                        
            }
        } else {
            if (idade < 10) {
                if (peso >= 15) {
                    System.out.println(" "+getNome()+" está novo e acima do peso!");
                } else {
                    System.out.println(" "+getNome()+" é um cachorro novo!");
                }
            }
        }
    }
    
}
