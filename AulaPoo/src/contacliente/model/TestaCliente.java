package contacliente.model;


import contacliente.Cliente;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(345,456784,35,"Ralph","Deve");
        Cliente cliente2 = new Cliente(214,654246,21,"Leozera","Deve");

        cliente1.visualizar();
        cliente2.visualizar();


    }
}
