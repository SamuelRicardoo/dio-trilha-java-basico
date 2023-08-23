package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.User;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Numero da Sua conta: ");
		int numero = sc.nextInt();
		System.out.print("Numero da Agencia: ");
		String agencia = sc.next();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Faça o seu primeiro deposito: ");
		double saldo = sc.nextDouble();
		
		
		User cliente = new User(numero, agencia, nome, saldo);
		
		System.out.print("Ola " + cliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + cliente.getAgencia() + ", conta " +  cliente.getNumero() + " e seu saldo "+ cliente.getSaldo()+" R$" + " já está disponivel para saque!");
		
	
		
		
	}
}
