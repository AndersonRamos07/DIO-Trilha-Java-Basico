import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exe01();
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
	}
}
