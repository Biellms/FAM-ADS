package trapezio;

public class Trapezio {

    // Atributos
    private int a, b, c, d, e;

    // Constructor
    public Trapezio() { }
    
    // Métodos
    public int Area() {
        e = (b+c) * d;
        a = e / 2;

        return a;
    }
 
    // Getters And Setters
    public int getA() { return a; }

    public void setA(int a) { this.a = a;  }

    public int getB() { return b; }

    public void setB(int b) { this.b = b; }

    public int getC() { return c; }

    public void setC(int c) { this.c = c; }

    public int getD() { return d; }

    public void setD(int d) { this.d = d; }

    public int getE() { return e;  }

    public void setE(int e) { this.e = e; }

}
