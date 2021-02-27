package ALURA.POO.Cliente;

import ALURA.POO.Conta.Conta;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Sr Teste");

        Conta conta = new Conta(1212,12);

        System.out.println(cliente);
    }
}
