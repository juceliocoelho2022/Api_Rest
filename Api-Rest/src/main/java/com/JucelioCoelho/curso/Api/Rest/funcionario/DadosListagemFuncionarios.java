package com.JucelioCoelho.curso.Api.Rest.funcionario;

public record DadosListagemFuncionarios(String nome, Especialidade especialidade) {

    public DadosListagemFuncionarios(Funcionario funcionario) {
        this(funcionario.getNome(), funcionario.getEspecialidade());
    }
}