package app.exception;


/**
 * Exceção lançada quando uma operação exige que o carrinho contenha itens,
 * mas ele se encontra vazio.
 */
/**
 * Exceção lançada quando ocorre um erro relacionado
 * às regras de negócio de empréstimos.
 */

public class CarrinhoVazioException extends RuntimeException {

    public CarrinhoVazioException() {
        super("O carrinho está vazio.");
    }

    public CarrinhoVazioException(String mensagem) {
        super(mensagem);
    }
}