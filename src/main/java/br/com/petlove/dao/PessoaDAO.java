package br.com.petlove.dao;

import br.com.petlove.infra.ConnectionFactory;
import br.com.petlove.model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PessoaDAO implements IPessoaDAO{
    @Override
    public Pessoa save(Pessoa pessoa) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO Pessoa (nome, cidade, telefone) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString (1, Pessoa.getNome());
            preparedStatement.setString(2, Pessoa.getCidade());
            preparedStatement.setString(3, Pessoa.getTelefone());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pessoa;
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Pessoa> FindAll() {
        return List.of();
    }

    @Override
    public Optional<Pessoa> findById(Long id) {
        return Optional.empty();
    }
}
