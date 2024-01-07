package br.diobank.diobank;
import java.util.UUID;
public class Saque implements IdTransacao{
    public boolean sacar(Conta conta, double valor){
        if (conta.getValor() >=  valor) {
            String tipoTransacao = "Saque - "+"valor: "+ valor;
            conta.setValue(conta.getValor() - valor);
            idTransacao(conta,tipoTransacao);
            return true;
        }
        else{
        return true;
        }
    }

    @Override
    public String idTransacao(Conta conta, String tipoTransacao) {
        String transacaoId = UUID.randomUUID().toString();
        String returnIdRandom = "ID"+ transacaoId + " - " + tipoTransacao;
        if (conta instanceof ContaCorrente){
            ((ContaCorrente)conta).addTransacao(returnIdRandom);
        }
        else if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca)conta).addTransacao(returnIdRandom);
        }
        return transacaoId;
    }
}
