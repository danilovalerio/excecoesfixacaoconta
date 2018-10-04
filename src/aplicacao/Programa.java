package aplicacao;

import java.util.Scanner;

import model.entidades.Conta;
import model.excecoes.ContaExceptions;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite os dados da conta");
			System.out.print("Número: ");
			Integer num = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Saldo: ");
			Double valor = sc.nextDouble();
			
			Conta c = new Conta(num, nome, valor);
			System.out.println(c.toString());
			
			System.out.println("\n\nRealizar saque na conta\n---------------------------------");
			System.out.print("Valor do saque: ");
			valor = sc.nextDouble();
			
			c.sacar(valor);
			System.out.println(c.toString());
			
		} catch (ContaExceptions e) {
			System.out.println("Erro:"+ e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado, contate o administrador."
					+"\nErro: "+e.getMessage());
		}
		
		
		sc.close();
		
		
		

	}

}
