package com.JucelioCoelho.curso.Api.Rest.services;

import java.util.Optional;


import com.JucelioCoelho.curso.Api.Rest.usuario.Usuario;
import com.JucelioCoelho.curso.Api.Rest.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class ValidationCPFUserExists implements ConstraintValidator<CpfJaCadastrado, String>{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext context) {
        if (cpf == null) {
            return true;
        }
        Optional<Usuario> usuarioExistente = usuarioRepository.findByCpf(cpf);
        return !usuarioExistente.isPresent();

    }
}
