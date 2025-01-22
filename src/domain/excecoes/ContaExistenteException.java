package domain.excecoes;

public class ContaExistenteException extends Exception{
    public ContaExistenteException(String mensagem) {
        super(mensagem);
    }
}
