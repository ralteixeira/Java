package contacliente;

public class Cliente {


    int agencia, numConta, idade;
    String nome, profissao;

    //Método Construtor


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente(int agencia, int numConta, int idade, String nome, String profissao) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;


    }


    public void visualizar(){

        System.out.println("*********Pesquisa Conta Cliente*******");

        System.out.println("Número Agencia Cliente: " + this.agencia);

        System.out.println("Numero da Conta Cliente: " + this.numConta);
        System.out.println("Idade do Cliente: " + this.idade);
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("Profissão Cliente: " + this.profissao);
    }
}
