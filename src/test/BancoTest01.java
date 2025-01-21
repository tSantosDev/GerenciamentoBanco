package test;

import domain.*;

public class BancoTest01 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Thiago", "07412153126");
        Cliente cliente2 = new Cliente("Giovanna", "42601573985");

        Conta conta1 = new ContaCorrente("3601254", cliente1, 2500);
        Conta conta2 = new ContaPoupanca("1054693", cliente1, 3650);
        Conta conta3 = new ContaInvestimento("4726518", cliente1, 0);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        Cliente clienteBuscado = banco.bucarClientePorNome("Jorge");

        if (clienteBuscado == null) {
            System.out.println("Cliente não encontrado, tente novamente!");
        } else {
            System.out.println("Cliente encontrado!");
            System.out.println(clienteBuscado.getNome());
            System.out.println(clienteBuscado.getCpf());
        }

    }
}
