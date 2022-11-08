package contabancaria.model;

public class ContaCorrente extends Conta{

    private float limite;


    public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
        super(numero, agencia, tipo, titular, saldo);
        this.limite = limite;


    }

    public boolean sacar(float valor){

        if(this.getSaldo() + this.getLimite() < valor){
            System.out.println("Saldo Insuficiente!");
            return false;

        }

        return true;
    }
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Limite de Crédito: " + this.limite);
    }
}
