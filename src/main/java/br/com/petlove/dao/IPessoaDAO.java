package br.com.petlove.dao;

import br.com.petlove.model.Pessoa;
import java.util.List;
import java.util.Optional;

public interface IPessoaDAO {
    Pessoa save (Pessoa pessoa);
    Pessoa update (Pessoa pessoa);
    void delete (Long id);
    List<Pessoa> FindAll();
    Optional<Pessoa> findById(Long id);
}
