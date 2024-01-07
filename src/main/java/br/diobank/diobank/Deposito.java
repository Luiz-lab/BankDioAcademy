package br.diobank.diobank;
import java.util.UUID;
public class Deposito implements IdTransacao{
    
    public void depositar(Conta conta, double valor){
        conta.setValue(conta.getValor() + valor);
        idTransacao(conta, "Deposito - "+"valor:"+ valor);
    }

    @Override
    public String idTransacao(Conta conta, String tipoTransacao) {
        String transacaoId = UUID.randomUUID().toString();
        String resultTransacaoId = "ID "+ transacaoId+" - "+tipoTransacao;
        if (conta instanceof ContaCorrente) {
            ((ContaCorrente)conta).addTransacao(resultTransacaoId);
        }
        else if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca)conta).addTransacao(resultTransacaoId);
        }
        return transacaoId;
    }

}
