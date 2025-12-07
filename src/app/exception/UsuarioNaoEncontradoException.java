package app.exception;
/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(String msg) {
        super(msg);
    }
}