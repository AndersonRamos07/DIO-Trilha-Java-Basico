import java.util.Scanner;

public class hcf150 {
	public static void main(String[] args) {
		boolean feito;
//		enum servicos { trocaDeOleo , reposicaoDeOleo , combustivel };
		int doisMilEDez,
			resposta,
			velocimetro;
		String ultimoServico = "";
		
		doisMilEDez = 0;
		velocimetro = 0;
		feito = false;
		
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
				case 3:
					inputServico(ultimoServico); break;					
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
	public static void showMe(String variavel)
	{
		System.out.print(variavel);
	}
	public static void showMenu()
	{
		System.out.printf("Menu:%n"
				+ "-1)inserir novo km:%n"
				+ "-2)verificar quantos km:%n"
				+ "-3)adicionar servico realizado:");
	}
	public static void showMarcador (int marcador)
	{
		System.out.printf("Velocimetro em: %dkm%n", marcador);
	}
	public static String inputServico (String servico)
	{
		Scanner scanSv = new Scanner(System.in);
		int km, codigo;
		System.out.println("Qual a kilometragem?");
		km = scanSv.nextInt();
		System.out.printf("Qual foi o servico realizado?%n"
				+ "0 - troca do oleo;%n"
				+ "1 - reposicao do oleo;%n"
				+ "2 - abastecimento;%n");
		codigo = scanSv.nextInt();
		servico = addServico(km, codigo);
		showMe("Foi realizado " + servico);
		return null;
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
//	public static void servicoRealizado (int km,
//										int kmAgora,
//										int codigoServico,
//										boolean feito)
//	{
//		String servico = "Nada a realizar";
//		switch(codigoServico)
//		{
//			case 0:
//				servico = "a troca do oleo"; break;
//			case 1:
//				servico = "a reposicao do oleo"; break;
//			case 2:
//				servico = "o abastecimento"; break;
//		}
//		int calculo = kmAgora - km;
//		if(feito == true)
//		{
//			System.out.printf("Favor realizar %s", servico);
//		}
//		else
//		{
//			System.out.println();
//		}
//	}
//	public static void alertaDeServico (int km, int kmDeAgora,String servico)
//	{
//		int calculo = km - kmDeAgora;
//		int proximoServico = 0;
//		if(servico == "a troca de oleo")
//		{
//			proximoServico = kmDeAgora + 500;
//			System.out.printf("Sua proxima troca sera com %dkm%n", proximoServico);
//			proximoServico = kmDeAgora + 250;
//			System.out.printf("Mas podera realizar a reposicao com %dkm", proximoServico);
//		}
//		if(servico == "a reposicao do oleo")
//		{
//			proximoServico = kmDeAgora + 500;
//			System.out.printf("Sua proxima troca sera com %dkm%n", proximoServico);
//		}
//	}
}