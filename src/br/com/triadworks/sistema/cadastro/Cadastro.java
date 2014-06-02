package br.com.triadworks.sistema.cadastro;

import java.util.Scanner;

import br.com.triadworks.sistema.Cliente;
import br.com.triadworks.sistema.Conta;

public class Cadastro {
	
	Cliente cliente = new Cliente();
	Conta conta = new Conta(cliente);
	Scanner s = new Scanner(System.in);
	Menu menu = new Menu();
	
	public void criaCadastro(){	
		System.out.println("Entre com as seguintes informações do cliente.");
		System.out.println("Nome: ");
			cliente.setNome(s.nextLine());
		System.out.println("RG: ");
			cliente.setRg(s.nextInt());
		System.out.println("CPF: ");
			cliente.setCpf(s.nextInt());
		
		System.out.println();
		
		System.out.println("Entre com as seguintes informações da Conta do cliente.");
		System.out.println("Número: ");
			conta.setNumero(s.nextInt());
		System.out.println("Saldo: ");
			conta.setSaldo(s.nextDouble());
		System.out.println("Limite:");
			conta.setLimite(s.nextDouble());
			
		System.out.println();
		System.out.println("Cadastro efetuado com sucesso!");
		System.out.println();
		System.out.println("Retornando ao menu principal...");
		System.out.println();
		
		menu.mostra();	
	}
	
	public void imprimeCadastro(){
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("RG: " + cliente.getRg());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println();
		System.out.println("Conta de número: " + conta.getNumero());
		System.out.println("Saldo da conta: " + conta.getSaldo());
		System.out.println("Limite da conta: " + conta.getLimite());
		
		System.out.println();
		System.out.println("Retornando ao menu principal...");
		System.out.println();
		
		menu.mostra();
	}	
}
