import java.util.Scanner;

public class Estrutura_Sequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exe01();
//		exe02();
//		exe03();
		exe04();
	}
	public static void exe01() {
		int number1, number2;
		int soma;
		
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		scan.close();
		soma = number1 + number2;
		System.out.println("SOMA = "+soma);
	}

	public static void exe02() {
		double raio, pi, result;
		
		pi = 3.14159;
	
		Scanner scan = new Scanner(System.in);
		raio = scan.nextDouble();
		result = pi * Math.pow(raio, 2);
		System.out.printf("A = %.4f",result);
	}
	
	public static void exe03() {
		int A, B, C, D, diferenca;
	
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		scan.close();
		diferenca = (A*B - C*D);
		System.out.print("DIFERENCA = " + diferenca);
	}

	public static void exe04() {
		int numerofuncionario;
		double	horasTrabalhadas,
				porHora, salario;
		
		Scanner scan = new Scanner(System.in);
		numerofuncionario = scan.nextInt();
		horasTrabalhadas = scan.nextDouble();
		porHora = scan.nextDouble();
		scan.close();
		salario = horasTrabalhadas * porHora;
		System.out.println("NUMBER = "+numerofuncionario);
		System.out.printf("SALARY = U$ %.2f",salario);
	}
}