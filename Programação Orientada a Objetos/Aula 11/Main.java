package herança2;

public class Main {

    public static void main(String[] args) {

        Homem a1 = new Homem("Gabriel", 20);
        Homem a2 = new Homem("Neymar", 29);
    
        Cao a3 = new Cao("Koda", 13);
        Cao a4 = new Cao("Kira", 8);
    
        Gato a5 = new Gato("Haruke", 4);
        Gato a6 = new Gato("Mimi", 8);

        System.out.println(" ----------------------------------------");
        a1.print();
        System.out.println(a1.Falar("Eaeee"));
        System.out.println(" ----------------------------------------");
        a2.print();
        System.out.println(a2.Falar("Salvee"));
        System.out.println(" ----------------------------------------");
        a3.print();
        System.out.println(a3.Falar("AU AU AU"));
        System.out.println(" ----------------------------------------");
        a4.print();
        System.out.println(a4.Falar("AauuUhuuAU"));
        System.out.println(" ----------------------------------------");
        a5.print();
        System.out.println(a5.Falar("Miaauu"));
        System.out.println(" ----------------------------------------");
        a6.print();
        System.out.println(a6.Falar("Mááu"));

    }
}
