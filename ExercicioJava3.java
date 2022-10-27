
import java.util.Scanner;

public class ExercicioJava3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		float bruto, adicNot, horaExtra, desconto, SalLiquido;
			
		System.out.println("Salário bruto: ");
		bruto= leia.nextFloat();
		
		System.out.println("Adicional noturno: ");
		adicNot = leia.nextFloat();
		
		System.out.println("Quantidade de horas extras: ");
		horaExtra= leia.nextFloat();
		
		System.out.println("Valor dos descontos: ");
		desconto= leia.nextFloat();
		
		SalLiquido = (bruto + adicNot) + (horaExtra * 100) - desconto ;
		System.out.println("Salário líquido de: " + SalLiquido);
		

	}

}