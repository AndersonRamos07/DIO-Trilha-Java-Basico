import java.util.Scanner;

public class hcf150 {
	public static void main(String[] args) {
		int doisMilEDez,
			kmRestantes,
			resposta,
			velocimetro;
		String ultimoServico = "";
		String[] servicos = {"a troca do oleo",
							"a reposicao do oleo",
							"o abastecimento"};
		
		doisMilEDez = 0;
		kmRestantes = 0;
		velocimetro = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			resposta = scan.nextInt();
			switch(resposta)
			{
				case 0:
					break;
				case 1:
					velocimetro += addKm();
				case 2:
					showMarcador(velocimetro);
					break;
				case 3:
					ultimoServico = inputServico(ultimoServico, velocimetro);
					kmRestantes = addKmServico(velocimetro);
					break;
				case 4:
					showMe(ultimoServico);
					System.out.println(kmRestantes);
					break;
				case 7:
					System.out.print(doisMilEDez);
//				default:
//					showMenu();
			}
			++doisMilEDez;
			checarKm(velocimetro, kmRestantes, ultimoServico, servicos);
			showMenu();
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
			System.out.printf("Quantos km hoje?%n_");
			km = scanKm.nextInt();
			System.out.printf("%dkm, confirma?%n"
					+ "S - sim, N - nao%n_", km);
			resposta = scanKm.next().charAt(0);
			if(resposta == 'S' || resposta == 's')
			{
				newKm = km;
			}
		}while(resposta == 'N' || resposta == 'n');
		return newKm;
	}
	public static void showMe(String variavel)
	{
		System.out.printf("%s%n_",variavel);
	}
	public static void showMenu()
	{
		System.out.printf("%n-------%n"
				+ "Menu:%n"
				+ "-1)adicionar kilometragem:%n"
				+ "-2)verificar velocimetro:%n"
				+ "-3)adicionar novo servico:%n"
				+ "-4)ultimo servico realizado:%n"
				+ "_");
	}
	public static void showMarcador (int marcador)
	{
		System.out.printf("[ Velocimetro em: %dkm ]%n_", marcador);
	}
	public static String inputServico (String servico, int km)
	{
		Scanner scanSv = new Scanner(System.in);
		int codigo;
//		km = scanSv.nextInt();
		System.out.printf("Qual foi o servico realizado?%n"
				+ "0 - troca do oleo;%n"
				+ "1 - reposicao do oleo;%n"
				+ "2 - abastecimento;%n");
		codigo = scanSv.nextInt();
		servico = addServico(km, codigo);
		showMe("Foi realizado " + servico + " aos "+ km + "km");
		return servico;
	}
	public static String addServico (int km, int codigoServico)
	{
		String servico = "Nada a realizar";
		switch(codigoServico)
		{
			case 0:
				servico = "a troca do oleo"; break;
			case 1:
				servico = "a reposicao do oleo"; break;
			case 2:
				servico = "o abastecimento"; break;
		}
		return servico;
	}
	public static int addKmServico (int km)
	{
		return km;
	}
	public static int checarKm (int km, int velo, String servico, String[] servicos)
	{
		int calculo = km - velo;
		int faltando = 500 - calculo;
		String resposta = "";
		if(servico == servicos[0])
		{
			resposta = servicos[1];
		}
		if(servico == servicos[1])
		{
			resposta = servicos[0];
		}
		if(calculo > 350)
		{
			showMe("Ja tem servico ai pra realizar");
			System.out.printf("< ! >%nFaltam apenas %dkm"
					+ " para realizar %s", faltando, resposta);
		}
		return km;
	}
}