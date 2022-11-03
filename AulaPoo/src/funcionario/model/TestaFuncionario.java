package funcionario.model;

import funcionario.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Noturno","Rafael","Mecânico", 46, 432);
        Funcionario func2 = new Funcionario("Vespertino", "João", "Gerente",34, 7654);

        func1.visualiza();
        func2.visualiza();

    }
}
