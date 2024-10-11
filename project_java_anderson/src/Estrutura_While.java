import java.util.Scanner;

public class Estrutura_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exe01();
//		exe02();
		exe03();

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
	public static void exe03()
	{
		int codigo = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		String preferencia = "";
		
		Scanner scan = new Scanner(System.in);
		
		codigo = scan.nextInt();

		while(codigo < 4 || codigo > 0 && codigo != 4)
		{
			codigo = scan.nextInt();
			if(codigo == 1)
				alcool += 1;
			if(codigo == 2)
				gasolina += 1;
			if(codigo == 3)
				diesel += 1;
		}
		if(codigo == 4)
		{
			preferencia = "MUITO OBRIGADO"
					+ "\nAlcool: "+ alcool
					+ "\nGasolina: "+ gasolina
					+ "\nDiesel: "+ diesel;
		}
		System.out.println(preferencia);
		
	}
}
