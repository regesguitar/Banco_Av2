package Model;

import java.util.Date;

public class Cliente {
	// codigo do cliente 
	private static int contador = 101;
	
	private int codigo;
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimetno;
	private Date dataCadastro;
	
	
	
	
	
	public Cliente(String nome, String email, String cpf, Date dataNascimetno) {
		this.codigo = Cliente.contador;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimetno = dataNascimetno;
		this.dataCadastro = new Date();
		Cliente.contador += 1;
	}
	public int getCodigo() {
		return this.codigo;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimetno() {
		return dataNascimetno;
	}
	public void setDataNascimetno(Date dataNascimetno) {
		this.dataNascimetno = dataNascimetno;
	}
	
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	

}
