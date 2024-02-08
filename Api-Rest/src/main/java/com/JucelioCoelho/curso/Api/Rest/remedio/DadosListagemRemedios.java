package com.JucelioCoelho.curso.Api.Rest.remedio;

public record DadosListagemRemedios(Long id, String nome, Laboratorio laboratorio, Via via , int quantidade) {

    public DadosListagemRemedios(Remedio remedio) {
        this(remedio.getId(),remedio.getNome(), remedio.getLaboratorio(), remedio.getVia(), remedio.getQuantidade());
    }

}