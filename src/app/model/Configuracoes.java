package app.model;
//TESTE
/**
 * Classe responsável por armazenar configurações
 * gerais do sistema.
 *
 * Exemplo: limite máximo de empréstimos simultâneos.
 */
public class Configuracoes {

    private int limiteEmprestimos = 3;

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public void setLimiteEmprestimos(int limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }
}