package br.diobank.diobank;

import java.util.ArrayList;
import java.util.List;
public class ContaPoupanca implements Conta{

    private double value;
    private List<String> transacao;

    public ContaPoupanca() {
        this.transacao = new ArrayList<>(); // Initialize the list
    }
    @Override
    public double getValor() {
        return this.value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void addTransacao(String idTransacao) {
        transacao.add(idTransacao);
    }

    @Override
    public List<String> getTransacoes() {
        return transacao;
    }
    
}
