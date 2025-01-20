package br.com.petlove;

import br.com.petlove.dao.PessoaDAO;
import br.com.petlove.model.Pessoa;

public class Application {

    public static void main (String[] args){
        PessoaDAO dao = new PessoaDAO();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setCidade("Presidente Getúlio");
        pessoa.setTelefone("4755889966");
        dao.save(pessoa);
    }
}
