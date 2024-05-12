package javabasico;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double saldo =2550.25;
		
		System.out.println("Por favor, digite seu nome !");
		String nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o número da agência");
		int agencia = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da conta!");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,sua agência é " + agencia + 
				",conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
		
		scanner.close();
		
		

	}

}
