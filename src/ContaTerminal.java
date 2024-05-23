import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
			
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o número da sua conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Digite sua agência: ");
		int agencia = scanner.nextInt();
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Informe seu saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nome);
		System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + conta);
		System.out.println("e seu saldo " + saldo + " já está disponível para saque");
					
	}
}
