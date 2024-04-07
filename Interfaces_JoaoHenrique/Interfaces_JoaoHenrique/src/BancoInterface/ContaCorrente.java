/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoInterface;

/**
 *
 * @author João Henrique
 */
public class ContaCorrente implements Conta{

    private double limite;
    private double saldo;
    
    @Override
    public double getSaldo() {
       return saldo + limite;
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public boolean retira(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado");
            return true;
        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        this.saldo = this.saldo + (this.saldo * (taxaSelic*2));
    }
    
}
