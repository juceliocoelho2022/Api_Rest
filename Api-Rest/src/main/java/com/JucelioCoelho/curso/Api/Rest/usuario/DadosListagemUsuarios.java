package com.JucelioCoelho.curso.Api.Rest.usuario;

public record DadosListagemUsuarios(String nome, String email) {

    public DadosListagemUsuarios(Usuario usuario) {
        this(usuario.getNome(),usuario.getEmail());
    }
}