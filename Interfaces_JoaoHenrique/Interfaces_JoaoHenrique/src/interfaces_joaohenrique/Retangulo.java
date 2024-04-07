/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_joaohenrique;

/**
 *
 * @author João Henrique
 */
public class Retangulo implements AreaCalculavel{

    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
        return this.largura * this.altura;
    }
    
}
