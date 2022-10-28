import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade;
        System.out.println("Informe a idade: ");
        idade = read.nextInt();

        if(idade >= 10 && idade <= 14){
            System.out.println("Categoria : Infantil.");
        }
        else if (idade >= 15 && idade <= 17){
            System.out.println("Categoria : Juvenil");
        }

        else if(idade >= 18 && idade <= 25){

            System.out.println("Categoria: Adulto");

        }

        else
            System.out.println("Idade digitada nao permitida, digite uma idade entre 10 e 25 anos");






    }
}