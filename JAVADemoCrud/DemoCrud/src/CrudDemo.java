
import java.util.*;

public class CrudDemo {
    public static void main(String[] args) {
        Collection<Colaborador> col =new ArrayList<Colaborador>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int  op;
        do{
            System.out.println("================ SISTEMA SIMPLES DE CADASTRO ================ ");
            System.out.println("1. CADASTRO DE COLABORADORES");
            System.out.println("2. VISUALIZAR CADASTRO DE COLABORADORES");
            System.out.println("3. PESQUISAR COLABORADOR");
            System.out.println("4. EXCLUIR REGISTRO COLABORADOR");
            System.out.println("5. ATUALIZAR REGISTRO COLABORADOR");
            System.out.println("0. SAIR SISTEMA CADASTRO");
            System.out.println("======== ESCOLHA UMA DAS OPÇÕES===========");
            op = s.nextInt();

            switch (op){
                case 1:
                        System.out.print("CADASTRAR NÚMERO DE REGISTRO: ");
                    int colnum = s.nextInt();

                    System.out.print("CADASTRAR NOME COLABORADOR: ");
                    String colnome = s1.nextLine();

                    System.out.print("DIGITE VALOR SALÁRIO: ");
                    int salario = s.nextInt();

                    col.add(new Colaborador(colnum, colnome, salario));
                    break;

                case 2:
                    System.out.println("================================");
                    Iterator<Colaborador> i = col.iterator();
                    while (i.hasNext()){
                        Colaborador e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("================================");
                    break;
                case 3:
                    boolean encontrado = false;
                    System.out.println("ENTRE COM O NÚMERO DE REGISTRO DO COLABORADOR: ");
                    colnum = s.nextInt();
                    System.out.println("================================");
                     i = col.iterator();
                    while (i.hasNext()){
                        Colaborador e = i.next();
                        if(e.getRegcolab() == colnum){
                            System.out.println(e);
                            encontrado = true;
                        }
                      }
                    System.out.println("================================");
                    if(!encontrado){
                        System.out.println("REGISTRO NÃO ENCONTRADO!");
                    }
                    System.out.println("================================");
                    break;

                case 4:
                    encontrado = false;
                    System.out.println("DIGITAR NUMERO DE REGISTRO PARA EXCLUSÃO: ");
                    colnum = s.nextInt();
                    System.out.println("================================");
                    i = col.iterator();
                    while (i.hasNext()){
                        Colaborador e = i.next();
                        if(e.getRegcolab() == colnum){
                            i.remove();
                            encontrado = true;
                        }
                    }
                    System.out.println("================================");
                    if(!encontrado){
                        System.out.println("REGISTRO NÃO ENCONTRADO!");
                    }else {
                        System.out.println("REGISTRO EXCLUÍDO COM SUCESSO!");
                    }
                    System.out.println("================================");
                    break;

                case 5:
                    encontrado = false;
                    System.out.println("ENTRE COM NUMERO DE REGISTRO PARA ATUALIZAÇÃO: ");
                    colnum = s.nextInt();
                    System.out.println("================================");
                    ListIterator<Colaborador> li = ((ArrayList<Colaborador>) col).listIterator();
                    while (li.hasNext()){
                        Colaborador e = li.next();
                        if(e.getRegcolab() == colnum){
                            System.out.println("DIGITE UM NOVO NOME: ");
                            colnome = s1.nextLine();

                            System.out.println("DIGITE UM NOVO SALÁRIO: ");
                             salario = s.nextInt();

                            li.set(new Colaborador(colnum, colnome, salario));
                            encontrado = true;
                        }
                    }
                    System.out.println("================================");
                    if(!encontrado){
                        System.out.println("REGISTRO NÃO ENCONTRADO!");
                    }else {
                        System.out.println("REGISTRO EXCLUÍDO COM SUCESSO!");
                    }
                    System.out.println("================================");
                    break;


            }

        }while (op != 0);
    }
}