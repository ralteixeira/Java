package contabancaria.model;

import contabancaria.util.Cores;
import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.Scanner;

public class Menu {
     public  static Scanner Leia = new Scanner(System.in);

     public static void main(String[] args) {

        int opcao;

        Conta conta1 = new Conta(1,123,1, "Ralph",10000.0f);

        conta1.visualizar();

         conta1.sacar(1200.0f);

        conta1.visualizar();


        conta1.depositar(5000.0f);

        ContaPoupanca contP1  = new ContaPoupanca(2,123,2, "Jonas", 5000,14);

        contP1.visualizar();

        Conta conta2 = new Conta(2,123,2, "Ralph", 5000);

        conta2.visualizar();

        conta2.sacar(10000);



        while (true){
            System.out.println(Cores.TEXT_PURPLE + "******************************************" + Cores.TEXT_RESET);
            System.out.println("                                          ");
            System.out.println("             BANCO ÁGIL OTA               ");
            System.out.println("                                          ");
            System.out.println("******************************************");
            System.out.println("                                          ");
            System.out.println("          1. Criar Conta                  ");
            System.out.println("          2. Saldo da Conta               ");
            System.out.println("          3. Dados da Conta               ");
            System.out.println("          4. Sacar                        ");
            System.out.println("          5.Depositar                     ");
            System.out.println("          6.Transferência                 ");
            System.out.println("          7.Sair                          ");
            System.out.println("                                          ");
            System.out.println("******************************************");
            System.out.println("Escolha Opção Desejada: ");
            opcao = Leia.nextInt();

            if(opcao == 7){
                System.out.println("\nBanco ÁGIL OTA - FACIL DE ENTRAR DIFICIL DE SAIR!");
                Leia.close();
                System.exit(0);
            }

            switch (opcao){
                case  1:
                    System.out.println(Cores.TEXT_WHITE + "CADASTRAR CONTA CORRENTE: \n\n");
                    System.out.println("NUMERO DA AGENCIA:");
                    agencia = Leia.nextInt();
                    System.out.println("NOME TITULAR DA CONTA");
                    Leia.skip("\\R?");
                    titular = Leia.nextLine();
                    System.out.println("DIGITE TIPO DA CONTA(1-CC OU 2-CP");
                    tipo = Leia.nextInt();
                    System.out.println("DIGITE SALDO DA CONTA");
                    saldo = Leia.nextFloat();
                    System.out.println("DIGITE O LIMITE");

                    System.out.println("DIGITE DIA DO ANIVERSARIO");
                    keyPress();
                    break;

                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Vizualizar Saldo\n\n");
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta");
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
                    break;

                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Transferencia entre contas\n\n");
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida");


            }
        }
    }

}
