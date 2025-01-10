package domain.excecoes;

public class DepositoInvalidoException extends Exception{
    public DepositoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
