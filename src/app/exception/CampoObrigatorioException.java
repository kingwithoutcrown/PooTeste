package app.exception;

/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class CampoObrigatorioException extends RuntimeException {
    public CampoObrigatorioException(String campo) {
        super("O campo '" + campo + "' é obrigatório.");
    }
}