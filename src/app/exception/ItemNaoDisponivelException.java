package app.exception;
/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class ItemNaoDisponivelException extends RuntimeException {
    public ItemNaoDisponivelException(String msg) {
        super(msg);
    }
}