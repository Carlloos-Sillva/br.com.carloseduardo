package br.com.carloseduardo.dao;

import org.springframework.stereotype.Repository;

import br.com.carloseduardo.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}