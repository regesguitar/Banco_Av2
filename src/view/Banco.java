package view;

import java.util.ArrayList;
import java.util.Scanner;

import helper.Utils;
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
		System.out.println("Selecione uma op��o no menu: ");
		System.out.println("1 - Criar conta ");
		System.out.println("2 - Efetuar saque ");
		System.out.println("3 - Efetuar dep�sito");
		System.out.println("4 - Efetuar transfer�ncia ");
		System.out.println("5 - Listar contas");
		System.out.println("6 - sair do sistema");
		
		try {
			opcao = Integer.parseInt(Banco.teclado.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("Por favor, inform uma op��o v�lida.");
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
			System.out.println("At� a pr�xima!");
			Utils.pausar(2);
			System.exit(0);
			
		default:
			System.out.println("Op��o inv�lida.");
			Utils.pausar(2);
			Banco.menu();
			break;
		}
		
	}
	
	public static void criarConta() {
		System.out.println("Criando conta...");
	}
	public static void efetuarSaque() {
		System.out.println("Efetuando saque...");
	}
	public static void efetuarDeposito() {
		System.out.println("Efetuando dep�sito...");
	}
	public static void efetuarTransferencia() {
		System.out.println("Efetuando transfer�ncia...");
	}
	public static void listarContas() {
		System.out.println("Listando contas...");
	}
}
