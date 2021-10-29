package br.com.carloseduardo.dao;

import org.springframework.stereotype.Repository;

import br.com.carloseduardo.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}