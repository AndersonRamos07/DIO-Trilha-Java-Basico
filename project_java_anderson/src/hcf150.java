import java.util.Scanner;

public class hcf150 {
	public static void main(String[] args) {
		boolean feito;
		char SimOuNao;
		int doisMilEDez,
			velocimetro,
			ultimatroca,
			resposta,
			kmDoDia;
		
		doisMilEDez = 0;
		velocimetro = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			resposta = scan.nextInt();
			switch(resposta)
			{
				case 0:
					showMenu(); break;
				case 1:
					velocimetro += addKm();
				case 2:
					showMarcador(velocimetro); break;
					
			}
			++doisMilEDez;
		}
		while(doisMilEDez < 2010);

		return;
	}
	public static int addKm ()
	{
		int km;
		int newKm = 0;
		char resposta;
		Scanner scanKm = new Scanner(System.in);
		
		do
		{
			System.out.println("Quantos km hoje?");
			km = scanKm.nextInt();
			System.out.printf("%dkm, confirma?%n"
					+ "S - sim, N - nao", km);
			resposta = scanKm.next().charAt(0);
			if(resposta == 'S' || resposta == 's')
			{
				newKm = km;
			}
		}while(resposta == 'N' || resposta == 'n');
		return newKm;
	}
	public static void showMarcador (int marcador)
	{
		System.out.printf("Velocimetro em: %dkm%n", marcador);
	}
	public static void showMenu()
	{
		System.out.printf("Menu:%n"
				+ "-1)inserir novo km:%n"
				+ "-2)verificar quantos km:");
	}
}