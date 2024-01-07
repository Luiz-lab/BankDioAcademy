package br.diobank.diobank;

public class Cliente {
    private int ag;
    private int contaPoupanca ;
    private int contaCorrente;
    private String name ;
    private String surname;
    private String cpf;

    public Cliente(String name, String surname,String cpf){
        this.ag = (int) (Math.random() * 10000);
        this.contaCorrente = (int) (Math.random() * 10000);
        this.contaPoupanca = (int) (Math.random() * 10000);
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
    }

    public int getAg() {
        return ag;
    }

    public int getContaPoupanca() {
        return contaPoupanca;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public String getName() {
        return name + " " + surname;
    }
    public String getCpf(){
        return cpf;
    }
    
}
