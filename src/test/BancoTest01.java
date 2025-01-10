package test;

import domain.*;

public class BancoTest01 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Thiago", "07412153126");
        Cliente cliente2 = new Cliente("Giovanna", "42601573985");

        Conta conta = new ContaCorrente("3601254", cliente1, 2500);
        Conta conta1 = new ContaPoupanca("1054693", cliente1, 3650);
        Conta conta2 = new ContaInvestimento("4726518", cliente1, 0);
    }
}
