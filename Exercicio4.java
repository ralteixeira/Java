import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int num1 , num2, num3, num4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Primeiro Valor");
		num1 = leia.nextInt();
		
		System.out.print("Segundo Numero");
		num2 = leia.nextInt();
		
		System.out.print("Terceiro Numero");
		num3 = leia.nextInt();
		
		System.out.print("Quarto Numero");
		num4 = leia.nextInt();
		
		
		diferenca =(num1 * num2) - (num3 * num4);
		
		System.out.println("Diferenca etre valores e: " + diferenca);
		
		
		
	}

}
