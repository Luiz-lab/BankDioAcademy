package br.diobank.diobank;
import java.util.List;

public interface Conta {
    public double getValor();
    public void setValue(double value);
    void addTransacao(String idTransacao);
    List<String> getTransacoes();

}
