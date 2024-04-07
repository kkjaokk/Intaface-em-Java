/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces_joaohenrique;

/**
 *
 * @author João Henrique
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        AreaCalculavel a = new Retangulo(3,2);
        AreaCalculavel b = new Quadrado(4);
        AreaCalculavel c = new Circulo(5);
        
        
        System.out.println(a.calculaArea());
        System.out.println(b.calculaArea());
        System.out.println(c.calculaArea());
        
        
    }
    
}
