package br.com.petlove.dao;

import br.com.petlove.infra.ConnectionFactory;
import br.com.petlove.model.Pet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetDAO implements IDAO<Pet> {

    @Override
    public void save(Pet t) {
        try (Connection con = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO Pet (nome, dataNascimento, tipo, raca) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, t.getNome());
            preparedStatement.setString(2, t.getDataNascimento());
            preparedStatement.setString(3, t.getTipo());
            preparedStatement.setString(4, t.getRaca());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar no Banco de Dados: " + e.getMessage());
        }
    }

    @Override
    public void update(Pet t) {
        try (Connection con = ConnectionFactory.getConnection()) {
            String sql = "UPDATE Pet SET nome = ?, dataNascimento = ?, tipo = ?, raca = ? WHERE id_pet = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, t.getNome());
            preparedStatement.setString(2, t.getDataNascimento());
            preparedStatement.setString(3, t.getTipo());
            preparedStatement.setString(4, t.getRaca());
            preparedStatement.setLong(5, t.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o Pet: " + e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM Pet WHERE id_pet = ?");

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir o pet: " + e.getMessage());
        }
    }

    @Override
    public List<Pet> findAll() {
        List<Pet> pets = new ArrayList();

        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM Pet");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                pets.add(new Pet(
                   rs.getString("nome"),
                   rs.getString("dataNascimento"),
                   rs.getString("tipo"),
                   rs.getString("raca")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        Pet pet = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM Pet WHERE id_pet = ?");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                pet = new Pet(
                  rs.getString("nome"),
                  rs.getString("dataNascimento"),
                  rs.getString("tipo"),
                  rs.getString("raca"),
                  rs.getLong("id_pet")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar Pet com ID" + id + ": " + e.getMessage());
        }
        return pet;
    }
}
