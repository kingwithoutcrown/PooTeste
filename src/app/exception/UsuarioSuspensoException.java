package app.exception;
/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class UsuarioSuspensoException extends RuntimeException {
    public UsuarioSuspensoException(String msg) {
        super(msg);
    }
}