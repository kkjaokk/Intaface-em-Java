/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BancoInterface;

/**
 *
 * @author João Henrique
 */
public interface Conta {
    
double getSaldo();
void deposita(double valor);
boolean retira(double valor);
void atualiza(double taxaSelic);
    
}
