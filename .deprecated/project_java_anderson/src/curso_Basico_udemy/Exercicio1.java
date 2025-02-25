package curso_Basico_udemy;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	//Exercicio 1
			String product1 = "Computer";
			String product2 = "Office desk";
			
			int age = 30; int code = 5290;
			
			char gender = 'F';
				
			double price1 = 2100.0; double price2 = 650.50;
			double measure = 53.234567;
			
//			Locale.setDefault(Locale.pt_BR);
			Locale.setDefault(new Locale("pt", "BR"));
				
			System.out.println("Products:");
			System.out.printf("%s, which price is $ %.2f", product1, price1);
			System.out.printf("%n%s, which price is $ %.2f", product2, price2);
			System.out.printf("%n%nRecord: %d years old, code %d and gender: %c", age, code, gender);
			System.out.printf("%n%nMeasue with eight decimal places: %.8f", measure);
			System.out.printf("%nRouded (three decimal places): %.3f", measure);
			Locale.setDefault(Locale.US);
			System.out.printf("%nUS decimal point: %.3f%n", measure);
			
			
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Digite o lado menor:");
//			double lado1 = scan.nextDouble();
//			System.out.println("Digite o lado maior:");
//			double lado2 = scan.nextDouble();
//			System.out.println("Digite o valor por metro:");
//			double valor = scan.nextDouble();
//			
//			double AREA = lado1 * lado2;
//			double PRECO = (lado2 * valor) * 10;
//			
//			System.out.printf("%n%nAREA = %.2f ; PRECO = %.2f", AREA, PRECO);
	}
			
}
