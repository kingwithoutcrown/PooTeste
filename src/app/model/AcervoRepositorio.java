package app.model;
//TESTE
import java.util.ArrayList;
import java.util.List;

/**
 * Repositório responsável por armazenar os itens
 * do acervo da biblioteca.
 */

public class AcervoRepositorio {

    private List<ItemAcervo> itens = new ArrayList<>();

    public AcervoRepositorio() {
        // exemplos para teste
        itens.add(new ItemAcervo(1, "O Senhor dos Anéis", StatusItem.DISPONIVEL));
        itens.add(new ItemAcervo(2, "Clean Code", StatusItem.DISPONIVEL));
        itens.add(new ItemAcervo(3, "Harry Potter", StatusItem.EMPRESTADO));
    }

    public ItemAcervo buscarPorId(int id) {
        return itens.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
