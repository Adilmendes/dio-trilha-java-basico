import java.util.Scanner;
import java.util.Locale;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Entrada do saldo inicial
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.println("Digite o valor da primiera transação: ");
        double transacao1 = scanner.nextDouble();
        
        System.out.println("Digite o valor da segunda transação: ");
        double transacao2 = scanner.nextDouble();
        
        System.out.println("Digite o valor da terceira transação: ");
        double transacao3 = scanner.nextDouble();
        

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
        
        // Saldo final
        System.out.printf("Saldo final: %.2f\n", saldoFinal)

        scanner.close();
    }

}
