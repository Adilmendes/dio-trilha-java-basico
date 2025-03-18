import java.util.Locale;  //utilizando localização por causa so double, varios erros de execução ate a correção (importando)
import java.util.Scanner; // utilizando o Scanner para entrada de dados (importando )

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        //inicializando o Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //inicializando os dados pelo terminal
        
        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu Saldo");
        double saldo = scanner.nextDouble();

        // exibindo os dados do terminal
        System.out.println("Olá, " + nome + " " + sobrenome +" obrigado por criar uma conta em nosso banco. ");
        System.out.println("Sua agência é " + agencia + " e conta " + conta);
        System.out.println("Seu saldo de R$ " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
