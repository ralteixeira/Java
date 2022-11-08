public class Colaborador {

    private int regcolab;
    private String nomeColab;
    private int salario;

    public Colaborador(int regcolab, String nomeColab, int salario) {
        this.regcolab = regcolab;
        this.nomeColab = nomeColab;
        this.salario = salario;
    }

    public int getRegcolab() {
        return regcolab;
    }

    public String getNomeColab() {
        return nomeColab;
    }

    public int getSalario() {
        return salario;
    }

    public String toString(){
        return regcolab + " " + nomeColab + " " + salario;
    }
}


