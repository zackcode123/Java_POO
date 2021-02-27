package Conta;

import Cliente.Cliente;

public class TestaConta {
    public static void main(String[] args) {
        //Primeira Conta
        Conta primeiraConta = new Conta(01, 0001);
        primeiraConta.setAgencia(01);

        Cliente clientePrimeiraConta = new Cliente();
        clientePrimeiraConta.setNome("Antonio");
        clientePrimeiraConta.setCpf("3333");
        clientePrimeiraConta.setProfissao("Gogo boy");

        primeiraConta.setTitular(clientePrimeiraConta);

        primeiraConta.deposita(150);
        System.out.println(primeiraConta);

        //Segunda Conta
        Conta segundaConta = new Conta(01,002);

        Cliente clienteSegundaConta = new Cliente();
        clienteSegundaConta.setNome("Sonia");
        clienteSegundaConta.setCpf("4040");
        clienteSegundaConta.setProfissao("Professora");

        segundaConta.setTitular(clienteSegundaConta);

        segundaConta.deposita(1000);
        System.out.println(segundaConta);

        segundaConta.transfere(70, primeiraConta);
        System.out.println(segundaConta);
        System.out.println(primeiraConta);

        System.out.println(Conta.getTotal());

    }
}
