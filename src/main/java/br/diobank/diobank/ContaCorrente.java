package br.diobank.diobank;

import java.util.ArrayList;
import java.util.List;
public class ContaCorrente implements Conta{

    private double value;
    private List<String> transacao;

    public ContaCorrente() {
        this.transacao = new ArrayList<>(); // Initialize the list
    }

    @Override
    public void addTransacao(String idTransacao) {
        transacao.add(idTransacao);
    }

    @Override
    public List<String> getTransacoes() {
        return transacao;
    }

    @Override
    public double getValor() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }
    
}
