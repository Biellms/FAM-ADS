/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dog;

/**
 *
 * @author 00250615
 */
public class mainDog {
    
    public static void main(String[] args) {

        Dog d1 = new Dog("Bob","Vira-Lata",0.3,10,true);
        Dog d2 = new Dog("Rex","Pastor Alemão",0.5,20,false);

        d1.print();
        d1.latir();
        d2.print();
        d2.latir();
        d1.pararLatir();
        d1.comecarLatir();
        d2.comecarLatir();
        d2.pararLatir();

    }
    
}
