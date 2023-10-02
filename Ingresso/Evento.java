
package Ingresso;

import java.time.LocalDate;


public class Evento {
    String nome;
    LocalDate data;
    String local;
    int qtdMaxIngressos;
    float valorIngresso;
    float valorAdicionalIngresso;
    Ingresso[] listaIngressosVendidos;

    public Evento(String nome, LocalDate data, String local, int qtdMaxIngressos, float valorIngresso, float valorAdicionalIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.qtdMaxIngressos = qtdMaxIngressos;
        this.valorIngresso = valorIngresso;
        this.valorAdicionalIngresso = valorAdicionalIngresso;
        this.listaIngressosVendidos = new Ingresso[qtdMaxIngressos];
    }
    
    //método getValorArrecadado
    
    
    //método venderIngresso
    
    
    

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getQtdMaxIngressos() {
        return qtdMaxIngressos;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public float getValorAdicionalIngresso() {
        return valorAdicionalIngresso;
    }

    public Ingresso[] getListaIngressosVendidos() {
        return listaIngressosVendidos;
    }
    
    
    
    
    
}
