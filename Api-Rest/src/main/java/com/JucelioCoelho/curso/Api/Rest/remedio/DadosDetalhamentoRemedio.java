package com.JucelioCoelho.curso.Api.Rest.remedio;

import java.time.LocalDate;

public record DadosDetalhamentoRemedio(Long id, String nome, Via via, Laboratorio laboratorio, LocalDate validade,
                                       String lote, int quantidade) {

    public DadosDetalhamentoRemedio(Remedio remedio) {
        this(remedio.getId(), remedio.getNome(), remedio.getVia(), remedio.getLaboratorio(), remedio.getValidade(),
                remedio.getLote(), remedio.getQuantidade());
    }
}