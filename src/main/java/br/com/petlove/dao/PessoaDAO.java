package br.com.petlove.dao;

import br.com.petlove.infra.ConnectionFactory;
import br.com.petlove.model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PessoaDAO implements IDAO<Pessoa>{

    @Override
    public void save(Pessoa t) {

    }

    @Override
    public void update(Pessoa t) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Pessoa> findAll() {
        return List.of();
    }

    @Override
    public Pessoa findById(Long id) {
        return null;
    }
}
