package br.com.triadworks.sistema.main;

import java.util.Scanner;

import br.com.triadworks.sistema.cadastro.*;


public class Executavel {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Cadastro c = new Cadastro();
		Menu menu = new Menu();
		
		menu.mostra();
		
		try{
			while(s.hasNext()){
				int opcao = s.nextInt();
		
				if(opcao == 1){
					c.criaCadastro();
				}
				if(opcao == 2){
					c.imprimeCadastro();
				}
				if(opcao <= 0 || opcao > 2){
					System.out.println("Opção inválida.");
				}
			} 
		}catch(java.util.InputMismatchException e){
				System.out.println("Campo preenchido de forma incorreta.");
		 }		
		
		s.close();
	}
}	
