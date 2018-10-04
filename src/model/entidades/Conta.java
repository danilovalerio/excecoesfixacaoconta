package model.entidades;

import model.excecoes.ContaExceptions;

public class Conta {
	private Integer numero;
	private String correntista;
	private Double saldo;
	//cheque especial será de 30% di saldo inicial
	private Double chequeEspecial;
	
	public Conta(Integer numero, String correntista, Double saldo) {
		this.numero = numero;
		this.correntista = correntista;
		this.saldo = saldo;
		this.chequeEspecial = (saldo * 0.3);
	}

	public void depositar(Double valor) {
		this.saldo += valor;
		
	}
	
	public void sacar(Double valor) {
		if(valor > this.saldo + this.chequeEspecial) {
			throw new ContaExceptions("Saque não permitido, saldo insuficiente!");
		} else {
			this.saldo -= valor;
		}
	}

	@Override
	public String toString() {
		return String.format("---------------------------------\n"
				+ "Conta: %s\n"
				+ "Correntista: %s \n"
				+ "Cheque especial R$ %.2f\n"
				+ "Saldo: R$ %.2f\n"
				+ "Total disponível: R$ %.2f\n---------------------------------", numero, correntista, 
										chequeEspecial, saldo, (chequeEspecial+saldo));
	}
	
	
	
	

}
