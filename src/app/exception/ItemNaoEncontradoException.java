package app.exception;
/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class ItemNaoEncontradoException extends RuntimeException {
    public ItemNaoEncontradoException(String msg) {
        super(msg);
    }
}