import java.util.Scanner;

public class Estrutura_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exe01();
		exe02();
//		exe03();
//		exe04();
//		exe05();
//		exe06();
//		exe07();
	}
	public static void exe01()
	{
		int number;		
		Scanner scan = new Scanner(System.in);		
		number = scan.nextInt();
		for(int i = 0; i < number || i == number; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		scan.close();
		}
	}
	public static void exe02()
	{
		int quantidade, numInOut;
		int nIm = 0;
		int nOut =0;		
		Scanner scan = new Scanner(System.in);		
		quantidade = scan.nextInt();
		for(int i = 0; i < quantidade; i++)
		{
			numInOut = scan.nextInt();
			if(numInOut >= 10 && numInOut <= 20)
				nIm++;
			else
				nOut++;
		}
		scan.close();
		System.out.println(nIm + " in \n"+nOut + " out");
	}
	public static void exe03()
	{
		
	}
	public static void exe04()
	{
		
	}
	public static void exe05()
	{
		
	}
	public static void exe06()
	{
		
	}
	public static void exe07()
	{
		
	}
}
