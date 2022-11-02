
import java.util.Scanner;
public class Exercicio01Java {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num1 = 0;
        int maior = 0;
        int menor = 0;

        while (num1 >= 0){
            System.out.println("Digite uma idade: ");
            num1 = leia.nextInt();

            if(num1 > 0 && num1 < 21){
                menor ++;
            }
            if(num1 > 50){
                maior ++;
            }
        }
        System.out.println("Pessoas com menos de 21 anos: " + menor);
        System.out.println("Pessoas com mais de 50 anos: " + maior);
    }
}
