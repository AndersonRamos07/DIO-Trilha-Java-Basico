import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        abrirConta();
        
    }
    public static void abrirConta ()
    {
        int numeroCliente = 0000;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.00;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o numero da sua Conta:");
            numeroCliente = scanner.nextInt();
            System.out.println("Agora o numero da Agencia:");
            agencia = scanner.next();
            System.out.println("Seu nome:");
            nomeCliente = scanner.next();
            scanner.nextLine();    //limpando o buffer do teclado, pois ha um espaco no nome
            System.out.println("Por fim, seu saldo em reais");
            saldo = scanner.nextDouble();
        
        scanner.close();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroCliente+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
