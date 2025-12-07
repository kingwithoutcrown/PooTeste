package app.exception;

/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class EmprestimoException extends RuntimeException {
    public EmprestimoException(String mensagem) {
        super(mensagem);
    }
}