/**
* <h1>ContaTerminal</h1>
* A ContaTerminal tem o objetivo de simular a criação de uma conta em um banco fictício. 
* <p>
*
* @author  Mattheus Camargo
* @version 1.0
* @since   09/09/2023
*/
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("SEJA BEM VINDO AO BANCO DIO!\n");
		
		System.out.println("Por favor, digite o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite o seu sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("Por favor, digite o número da Agência: ");
		String numAgencia = scanner.next();
		
		System.out.println("Por favor, digite o número da Conta: ");
		int numConta = scanner.nextInt();
		
		System.out.println("Por favor, informe o valor que deseja depositar: ");
		double saldoCliente = scanner.nextDouble();
		
		System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo R$" + saldoCliente + " já está disponível para saque.");
	}

}
