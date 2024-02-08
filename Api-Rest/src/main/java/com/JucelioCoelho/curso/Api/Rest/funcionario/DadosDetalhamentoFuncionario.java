package com.JucelioCoelho.curso.Api.Rest.funcionario;


import com.JucelioCoelho.curso.Api.Rest.endereco.Endereco;

public record DadosDetalhamentoFuncionario(Long id, String nome, String email, String cpf, Especialidade especialidade,
                                           Endereco endereco) {

    public DadosDetalhamentoFuncionario(Funcionario funcionario) {
        this(funcionario.getId(), funcionario.getNome(), funcionario.getEmail(),funcionario.getCpf(),
                funcionario.getEspecialidade(),funcionario.getEndereco());
    }

}
