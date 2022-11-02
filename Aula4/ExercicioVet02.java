import java.util.Scanner;

public class ExercicioVet02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero,soma = 0;
        String impar ="", par = "";
        int[] vetorNumero = new int [10];

        for (int i = 0 ; i < 10 ; i ++)
        {
            System.out.println("Adicione um numero no vetor: ");
            numero = leia.nextInt();
            vetorNumero[i] = numero;
        }
        for (int i = 0; i < vetorNumero.length; i ++)
        {
            if (i % 2 != 0)
            {
                impar += " " + vetorNumero[i];
            }
            if (vetorNumero[i] % 2 == 0)
            {
                par += " " +vetorNumero [i];
            }
            soma += vetorNumero[i];

        }
        System.out.println("Indices ímpares:" + impar);
        System.out.println("Indices pares:" + par);
        System.out.println("Soma : " + soma);
        System.out.println("Média : " + soma / 10);

    }
}
