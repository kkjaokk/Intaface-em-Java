package Banco;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    void atualiza(double taxa) {
        super.deposita(this.getSaldo() * (taxa * 2));
    }
    
    @Override
     void deposita(double valor) {
         super.deposita(valor-1);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

}