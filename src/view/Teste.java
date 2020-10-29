package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Cliente alzir = new Cliente(
				"Alzir Falcao", 
				"alzir@unifor.br",
				"542.545.541.05",
				Utils.stringParaData("10/05/1970")
				);
		
		Cliente alan = new Cliente("Alan Carlos", 
				"alan@edu.unifor.br",
				"252.222.145.12",
				Utils.stringParaData("05/04/1968")
				);
		
//		System.out.println(alan);
//		System.out.println();
//		System.out.println(alzir);
		
		Conta c101 = new Conta(alzir);
		Conta c102 = new Conta (alan);
		
		//Depositando um valor positivo
		c101.depositar(500.00);
    	c102.depositar(500.00);
		
		//Depositando um valor 0
//		c101.depositar(0.00);
//		c102.depositar(0.00);
		
		//Depositando um valor negativo
//		c101.depositar(-500.00);
//		c102.depositar(-500.00);
		
		
		//Tentando sacar valor no saldo suficiente
 //   	c101.sacar(300.00);
    	
    	//Tentando sacar valor 0
    	//c101.sacar(0.0);
    	
    	
    	//Tentando sacar valor negativo
    	//c101.sacar(-100.00);
    	
    	
    	//Setando um limite para a c101
    	c101.setLimite(200.0);
    	
    	//Tentando sacar um valor maior que o saldo
    	//c101.sacar(600.0);
    	
    	
    	c101.transferir(c102, 100.0);
		
		System.out.println(c101);
		System.out.println();
		System.out.println(c102);
	}

}
