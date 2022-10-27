
import java.util.Scanner;

public class ExercicioJava1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
			
		System.out.println("Valor do Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = (salario + abono);
		System.out.println("Seu novo salário é de: " + novoSalario);
		

	}

}