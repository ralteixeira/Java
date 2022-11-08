package contabancaria.model;

import java.net.PortUnreachableException;

public class Conta {

    // atributos (Variavels
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void visualizar() {

        String tipo = "";

        switch(this.tipo) {
            case 1:
                tipo = "CONTA CORRENTE";
                break;
            case 2:
                tipo = "CONTA POUPANÇA";
                break;
        }
        System.out.println("\n *********************");
        System.out.println("\n DADOS DA CONTA. ");
        System.out.println("\n *********************");
        System.out.println("\n NUMERO DA CONTA: " + this.numero);
        System.out.println("\n NUMERO DA AGENCIA: " + this.agencia);
        System.out.println("\n TIPO DE CONTA. " + tipo);
        System.out.println("\n TITULAR DA CONTA. " + this.titular);
        System.out.println("\n SALDO: " + this.saldo);


    }

        //Metodo sacar Casse Conta
    public boolean sacar(float valor) {
        if (this.getSaldo() < valor) {
            System.out.println("SALDO INSUFICIENTE");

            this.setSaldo(this.getSaldo() - valor);
        }
        setSaldo(getSaldo() - valor);
        return true;
    }

    public void depositar(float valor){

        this.setSaldo(this.getSaldo() + valor);
    }


}