package app.model;

//TESTE
/**
 * Busca um item do acervo pelo ID.
 *
 * @param idTexto identificador do item em formato texto
 * @return item encontrado e disponível
 * @throws ItemInvalidoException se o ID não for numérico
 * @throws ItemNaoEncontradoException se o item não existir
 * @throws ItemNaoDisponivelException se o item não estiver disponível
 */
/**
 * Representa um item do acervo da biblioteca.
 * Pode ser um livro ou outro material disponível
 * para empréstimo.
 */
public class ItemAcervo {

    private int id;
    private String titulo;
    private StatusItem status;

    public ItemAcervo(int id, String titulo, StatusItem status) {
        this.id = id;
        this.titulo = titulo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public StatusItem getStatus() {
        return status;
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }
}