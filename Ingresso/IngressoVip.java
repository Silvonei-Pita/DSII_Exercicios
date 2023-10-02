
package Ingresso;

public class IngressoVip extends Ingresso {
    private float valorAdicional;

    public IngressoVip(float valorAdicional, float valor, String nomeCliente, String cpf) {
        super(valor, nomeCliente, cpf);
        this.valorAdicional = valorAdicional;
    }

    //Getters
    public float getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public float getValor() {
        return valor + valorAdicional; 
    }
    
    
    
}
