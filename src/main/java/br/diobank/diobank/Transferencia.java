package br.diobank.diobank;

import java.util.UUID;

public class Transferencia implements IdTransacao{


    public boolean transferir(Conta contaCreditada, Conta contaDebitada, double valor){
        if (contaDebitada.getValor() >= valor) {
            contaDebitada.setValue(contaDebitada.getValor()- valor);
            contaCreditada.setValue(contaCreditada.getValor()+ valor);
            idTransacao(contaCreditada, "Tranferencia Credito - "+"valor:"+ valor);
            idTransacao(contaDebitada, "Traferencia Debito - "+"valor:"+ valor);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String idTransacao(Conta conta, String tipoTransacao) {
        String transacaoId = UUID.randomUUID().toString();
        String registroIdTransacao = "ID"+ transacaoId+" - " + tipoTransacao;
        if (conta instanceof ContaCorrente) {
            ((ContaCorrente)conta).addTransacao(registroIdTransacao);
        }
        else if(conta instanceof ContaPoupanca){
            ((ContaPoupanca)conta).addTransacao(registroIdTransacao);
        }
        return transacaoId;
    }
}
