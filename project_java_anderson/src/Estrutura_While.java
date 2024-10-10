import java.util.Scanner;

public class Estrutura_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exe01();
		exe02();

	}
	public static void exe01()
	{
		int senha = 1;
		
		Scanner scan = new Scanner(System.in);
		
		senha = scan.nextInt();
		
		while(senha != 2002)
		{
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}
		System.out.println("Acesso Permitido");
	}
	public static void exe02()
	{
		String coordenada = "NULA";
		Scanner scan = new Scanner(System.in);
		
		int coordenadaX = 1;
		int coordenadaY = 1;
		

		while(coordenadaX != 0 && coordenadaY != 0)
		{
			coordenadaX = scan.nextInt();
			coordenadaY = scan.nextInt();
			if(coordenadaX > 0 && coordenadaY > 0)
				coordenada = "primeiro";
			if(coordenadaX < 0 && coordenadaY > 0)
				coordenada = "segundo";
			if(coordenadaX < 0 && coordenadaY < 0)
				coordenada = "terceiro";
			if(coordenadaX > 0 && coordenadaY < 0)
				coordenada = "quarto";
			if(coordenadaX == 0 || coordenadaY == 0)
				coordenada = "";
			System.out.println(coordenada);
		}
		scan.close();
	}
}
