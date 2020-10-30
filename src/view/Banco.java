package view;

import java.util.ArrayList;
import java.util.Scanner;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Banco {
	
	static String nome = "Unifor Bank";
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Conta> contas;
	

	public static void main(String[] args) {
		Banco.contas = new ArrayList<Conta>();
		Banco.menu();
		
	}
	
	public static void menu( ) {
		int opcao = 0;
		System.out.println("======================================");
		System.out.println("=============== ATM  =================");
		System.out.println("=========== " + Banco.nome + " ==============");
		System.out.println("Selecione uma opção no menu: ");
		System.out.println("1 - Criar conta ");
		System.out.println("2 - Efetuar saque ");
		System.out.println("3 - Efetuar depósito");
		System.out.println("4 - Efetuar transferência ");
		System.out.println("5 - Listar contas");
		System.out.println("6 - sair do sistema");
		
		try {
			opcao = Integer.parseInt(Banco.teclado.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("Por favor, inform uma opção válida.");
			Utils.pausar(1);
			Banco.menu();
			
		}
		
		switch (opcao) {
		case 1:
			Banco.criarConta();
			break;
		case 2:
			Banco.efetuarSaque();
			break;
		case 3:
			Banco.efetuarDeposito();
			break;
		case 4: 
			Banco.efetuarTransferencia();
			break;
		case 5:
			Banco.listarContas();
			break;
		case 6:
			System.out.println("Até a próxima!");
			Utils.pausar(2);
			System.exit(0);
			
		default:
			System.out.println("Opção inválida.");
			Utils.pausar(2);
			Banco.menu();
			break;
		}
		
	}
	
	public static void criarConta() {
		System.out.println("Informe os dados do cliente: ");
		
		System.out.println("Nome do cliente: ");
		String nome = Banco.teclado.nextLine();
		
		System.out.println("E-mail do cliente: ");
		String email = Banco.teclado.nextLine();
		
		System.out.println("CPF do cliente: ");
		String cpf = Banco.teclado.nextLine();
		
		System.out.println("Data de nascimento do cliente ");
		String data_nascimento = Banco.teclado.nextLine();
		
		Cliente cliente = new Cliente (nome, email, cpf,  Utils.stringParaData(data_nascimento));
		
		Conta conta  = new Conta(cliente);
		
		Banco.contas.add(conta);
		
		System.out.println("Conta criada com sucesso!");
		System.out.println("Dados da conta criada: ");
		System.out.println(conta);
		System.out.println();
		
		Utils.pausar(4);
		Banco.menu();
		
		
	}
	public static void efetuarSaque() {
		System.out.println("Efetuando saque...");
	}
	public static void efetuarDeposito() {
		System.out.println("Efetuando depósito...");
	}
	public static void efetuarTransferencia() {
		System.out.println("Efetuando transferência...");
	}
	public static void listarContas() {
		System.out.println("Listando contas...");
	}
}
