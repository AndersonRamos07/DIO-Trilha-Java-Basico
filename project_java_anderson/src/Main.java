import curso_dio.SmartTv;

public class Main {	//Usuario

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		SmartTv smartTv = new SmartTv();

		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();

		smartTv.mudarCanal(46);

		System.out.println("TV Ligada? "+smartTv.ligada);
		System.out.println("Canal Atual: "+smartTv.canal);
		System.out.println("Volume Atual: "+smartTv.volume);

		smartTv.ligar();
		System.out.println("Novo Status => TV Ligada? "+smartTv.ligada);

//		double x = 10.358923;
//		System.out.println("Hello World!");
//		System.out.printf("%.2f%n", x);
		
//		Exercicio1 exercicio = new Exercicio1();
//		exercicio.main(null);
	}

}
