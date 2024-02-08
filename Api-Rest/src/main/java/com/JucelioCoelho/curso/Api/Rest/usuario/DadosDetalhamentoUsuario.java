package com.JucelioCoelho.curso.Api.Rest.usuario;


import com.JucelioCoelho.curso.Api.Rest.endereco.Endereco;

public record DadosDetalhamentoUsuario(Long id, String nome, String login, String email, String cpf, Endereco endereco) {

    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getEmail(), usuario.getCpf(), usuario.getEndereco());
    }
}