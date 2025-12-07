package app.exception;

/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class UsuarioInvalidoException extends RuntimeException {
    public UsuarioInvalidoException(String mensagem) {
        super(mensagem);
    }
}
