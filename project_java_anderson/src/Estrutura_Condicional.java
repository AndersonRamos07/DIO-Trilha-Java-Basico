import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exe01();
//		exe02();
		exe03();
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

}
