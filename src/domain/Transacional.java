package domain;

import domain.excecoes.DepositoInvalidoException;
import domain.excecoes.SaqueInvalidoException;

public interface Transacional {
    void depositar(double valor) throws DepositoInvalidoException;
    void sacar(double valor) throws SaqueInvalidoException;
}
