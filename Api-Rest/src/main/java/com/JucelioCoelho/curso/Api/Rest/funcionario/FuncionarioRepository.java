package com.JucelioCoelho.curso.Api.Rest.funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

<<<<<<< HEAD
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

    @Query
    Funcionario findByNome(@Param("name") String name);
=======
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query
    Funcionario findByNome(@Param("name") String name);
}
>>>>>>> e3c560a (contoller)
