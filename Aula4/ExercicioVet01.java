import java.util.Scanner;

public class ExercicioVet01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        boolean validador = false;

        int[] vetorNumero = new int[] {2,5,1,3,4,9,7,8,10};
        System.out.println("Digite um número: ");
        numero = leia.nextInt();

        for (int index = 0 ; index < vetorNumero.length ; index ++)
        {
            if (vetorNumero[index] == numero)
            {
                System.out.println("Número " + numero + " está na posição: " + index);
                validador = true;

            }

        }
        if ( validador = false)
            System.out.println("Número " + numero + " não encontrado!");
    }
}