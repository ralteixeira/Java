/*Escreva um algoritmo em Java, que leia 10 números inteiros
via teclado e mostre na tela quantos números são pares e
quantos número são ímpares.
*/

import java.util.Scanner;
public class Exercicio02Java {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero = 0, numPar = 0, numImp = 0;

        while(numero >= 0){

            System.out.println("Digite um numero: ");
            numero = leia.nextInt();

            if(numero % 2 == 0){
                numPar ++;
            }
            if(numero % 2 == 1){
                numImp ++;
            }

        }
        System.out.println("Numeros Pares" + numPar);
        System.out.println("Numeros Impares" + numImp);


    }
}
