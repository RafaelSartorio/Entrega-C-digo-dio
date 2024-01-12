import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        int conta;
        String Agencia;
        String nomeCliente;
        float saldoConta = 1000.50f;

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da sua agencia: ");
        Agencia = scanner.nextLine();

        System.out.println("Digite o numero a conta: ");
        conta = scanner.nextInt();

        
        System.out.println(" Ola " + nomeCliente + " obrigado por criar a conta no nosso banco");
        System.out.println("sua agencia eh "+ Agencia+ " e conta eh " + conta );
        System.out.println("seu saldo disponivel eh de " + saldoConta + " ja esta disponivel para saque");


    
        
    }
}
