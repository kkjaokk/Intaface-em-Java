/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_joaohenrique;

/**
 *
 * @author João Henrique
 */
public class Circulo implements AreaCalculavel{

    private int raio;
    
    public Circulo(int raio) {
    this.raio = raio;
}

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculaArea() {
        return Math.PI * (this.raio * this.raio);
    }
    
}
