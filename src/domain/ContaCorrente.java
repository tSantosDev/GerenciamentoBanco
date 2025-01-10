package domain;

import domain.excecoes.DepositoInvalidoException;
import domain.excecoes.SaqueInvalidoException;

public class ContaCorrente extends Conta {
    private static final TiposDeConta TIPOS_DE_CONTA = TiposDeConta.CORRENTE;
    public ContaCorrente(String numero, Cliente titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }

    @Override
    public void depositar(double valor) throws DepositoInvalidoException {
        if (valor <= 0) {
            throw new DepositoInvalidoException("Depósito inválido");
        }
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) throws SaqueInvalidoException {
        if (valor > this.getSaldo()) {
            throw new SaqueInvalidoException("Saque inválido");
        }
        this.setSaldo(this.getSaldo() - valor);
    }

    public TiposDeConta tiposDeConta() {
        return TIPOS_DE_CONTA;
    }
}
