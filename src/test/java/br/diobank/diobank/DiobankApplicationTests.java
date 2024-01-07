package br.diobank.diobank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiobankApplicationTests {


	@Test
	void createAccount(){
		Cliente cliente = new Cliente("Natalia", "Delamanrte", "036.971.411-39");
		assertEquals(cliente.getCpf(), "036.971.411-39");
	}

	@Test
	void executeDeposito(){
		Conta cp = new ContaPoupanca();
		cp.setValue(200);
		Conta cc = new ContaCorrente();
		cc.setValue(200);
		Deposito deposito = new Deposito();
		deposito.depositar(cc, 200);
		assertEquals(400.0, cc.getValor());
		}

	@Test
	void executeSaque(){
		Conta cp = new ContaPoupanca();
		cp.setValue(200);
		Conta cc = new ContaCorrente();
		cc.setValue(200);
		Saque saque = new Saque();
		saque.sacar(cc, 100);
		assertEquals(100, cc.getValor());
	}
}
