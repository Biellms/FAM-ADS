
package ufc;

import java.util.*;

public class Luta {
    
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean status;

    // Constructor
    public Luta() {

    }

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria() == l2.getCategoria()) {
            status = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            status = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar() {
        if(status) {
            
            desafiado.status();
            desafiante.status();
            
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println(" A luta empatou\n");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(" O "+desafiado.getNome()+" venceu a luta!\n");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(" O "+desafiante.getNome()+" venceu a luta!\n");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                }

        } else {
            System.out.println(" A categoria dos lutadores são diferentes\n "
            + "Por isso a luta não pode acontecer!\n");
        }
    }

    // Getters and Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
