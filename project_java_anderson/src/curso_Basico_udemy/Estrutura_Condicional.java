import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exe01();
//		exe02();
//		exe03();
//		exe04();
//		exe05();
//		exe06();
//		exe07();
		exe08();
	}
	public static void exe01()
	{
		int number = 0;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		if(number > 0 || number == 0)
			System.out.println("NAO NEGATIVO");
		else
			System.out.println("NEGATIVO");
		scan.close();
	}
	public static void exe02()
	{
		int number = 0;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		if(number % 2 == 0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		scan.close();
	}
	public static void exe03()
	{
		int number1, number2;
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		if(number1 % number2 == 0 || number2 % number1 == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao multiplos");
	}
	public static void exe04()
	{
		int horaInicial, horaFinal, duracao;
		
		Scanner scan = new Scanner(System.in);
		
		horaInicial = scan.nextInt();
		horaFinal = scan.nextInt();
		duracao = (horaInicial - horaFinal)*-1;
		if(horaInicial > horaFinal)
		{
			duracao = (24 - (horaInicial - horaFinal));
		} else if(duracao == 0 &&
				horaInicial == 0 &&
				horaFinal == 0)
		{
			duracao = 24;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
	}
	public static void exe05()
	{
		double codigo, preco,
			quantidade, total;
		
		Scanner scan = new Scanner(System.in);
		
		preco = 0;
		codigo = scan.nextDouble();
		quantidade = scan.nextDouble();
		
		if(codigo == 1) preco = 4.00;
		if(codigo == 2) preco = 4.50;
		if(codigo == 3) preco = 5.00;
		if(codigo == 4) preco = 2.00;
		if(codigo == 5) preco = 1.50;
		
		total = quantidade * preco;
		
		System.out.printf("Total: R$ %.2f", total);
	}
	public static void exe06()
	{
		double valor;
		String intervalo = "Fora de intervalo";
		
		Scanner scan = new Scanner(System.in);
		
		valor = scan.nextDouble();
		
		if(valor > 0 && valor < 25.00 || valor == 25.00)
			{intervalo = "Intervalo [0,25]";}
		if(valor > 25.00 && valor < 50.00 || valor == 50.00)
			{intervalo = "Intervalo (25,50]";}
		if(valor > 50.00 && valor < 75.00 || valor == 50.00)
			{intervalo = "Intervalo (50,75]";}
		if(valor > 75.00 && valor < 100.00 || valor == 100.00)
			{intervalo = "Intervalo (75,100]";}
		
		System.out.println(intervalo);
	}
	public static void exe07()
	{
		double eixoX, eixoY;
		String coordenadas = "Origem";
		
		Scanner scan = new Scanner(System.in);
		eixoX = scan.nextDouble();
		eixoY = scan.nextDouble();
		
		if(eixoX > 0.0 && eixoY > 0.0)
		{ coordenadas = "Q1";}
		if(eixoX < 0.0 && eixoY > 0.0)
		{ coordenadas = "Q2";}
		if(eixoX < 0.0 && eixoY < 0.0)
		{ coordenadas = "Q3";}
		if(eixoX > 0.0 && eixoY < 0.0)
		{ coordenadas = "Q4";}
		
		System.out.println(coordenadas);
}
	public static void exe08()
	{
		double salario, taxa;
		String imposto = "Isento";
		
		Scanner scan = new Scanner(System.in);
		
		salario = scan.nextDouble();
		taxa = 0;
		
		if(salario > 2000.01 && salario < 3000.01)
			taxa = (salario - 2000.00)*0.08;
		if(salario > 3000.01 && salario < 4500.00)
			taxa = ((salario - 2000.00) - 1000.00)*0.18
										+ (1000.00*0.08);
		if(salario > 4500.00)
			taxa = (salario - 4500.00)*0.28 +
					(1500 * 0.18) + (1000.00*0.08);
		if(taxa == 0.0)
			System.out.print(imposto);
		else
			System.out.printf("%.2f",taxa);
	}
	
 	public static void consoleLog(String var)
	{
		System.out.println(var);
	}
}
