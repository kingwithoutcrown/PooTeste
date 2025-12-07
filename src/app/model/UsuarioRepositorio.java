package app.model;

//TESTE

import java.util.ArrayList;
import java.util.List;

/**
 * Repositório responsável por armazenar e gerenciar
 * os usuários do sistema.
 */

public class UsuarioRepositorio {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepositorio() {
        // adiciona alguns dados para teste
        usuarios.add(new Usuario("111", "Maria", StatusUsuario.Ativo));
        usuarios.add(new Usuario("222", "João", StatusUsuario.Ativo));
        usuarios.add(new Usuario("333", "Carlos", StatusUsuario.SuspensoPorMulta));
    }

    public Usuario buscarPorMatricula(String matricula) {
        return usuarios.stream()
                .filter(u -> u.getMatricula().equals(matricula))
                .findFirst()
                .orElse(null);
    }
}