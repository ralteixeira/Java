package funcionario;

public class Funcionario {

    String turnoTrabalho,nome,cargo;
    int idade,numRegistro;

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Funcionario(String turnoTrabalho, String nome, String cargo, int idade, int numRegistro) {
        this.turnoTrabalho = turnoTrabalho;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.numRegistro = numRegistro;


    }

    public void visualiza(){
        System.out.println("*****Informações sobre Funcionário*****");
        System.out.println("                                       ");
        System.out.println("Turno Trabalho - " + this.turnoTrabalho);
        System.out.println("Nome do Funcionário - " + this.nome);
        System.out.println("Cargo Exercido na Empresa - " + this.cargo);
        System.out.println("Idade do Funcionário - " + this.idade);
        System.out.println("Numero de Registro Funcionário - " + this.numRegistro);
    }
}
