package app.model;

import app.exception.UsuarioNaoEncontradoException;
import app.exception.UsuarioSuspensoException;

//-------TESTE
/**
 * Representa um usuário do sistema de biblioteca.
 * Cada usuário possui uma matrícula única, nome
 * e um status que define se pode realizar empréstimos.
 */

public class Usuario {

    private String matricula;
    private String nome;
    private StatusUsuario status;
/**
 * Busca um usuário a partir da matrícula informada.
 *
 * @param matricula matrícula do usuário
 * @return usuário encontrado
 * @throws UsuarioNaoEncontradoException se o campo estiver vazio ou o usuário não existir
 * @throws UsuarioSuspensoException se o usuário estiver suspenso por multa
 */

    public Usuario(String matricula, String nome, StatusUsuario status) {
        this.matricula = matricula;
        this.nome = nome;
        this.status = status;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }
}