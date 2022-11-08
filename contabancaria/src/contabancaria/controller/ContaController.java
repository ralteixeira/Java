package contabancaria.controller;
import contabancaria.model.Conta;
import contabancaria.repository.ContaController;

public class ContaController {

    @Override
    public void procurarPorNumero(int numero){

    }

    @Override
    public void listarTodas(){

        for(var conta : listaContas){

            conta.visualizar();
        }

    }

    public void cadastrar(Conta conta){
        conta.setNumero(gerarNumero());
        listaContas.add(conta);
        System.out.println("\nA CONTA FOI CRIADA!");
    }

    public int gerarNumero() {
        return 0;listaContas.size + 1;

    }
}
