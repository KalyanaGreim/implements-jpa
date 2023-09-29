package org.kaly.dao;

import org.kaly.domain.Curso;
import org.kaly.domain.Produto;

import java.util.List;

public interface IProdutoDao {
    public Produto cadastrar(Produto curso);

    public void excluir(Produto prod);

    public List<Produto> buscarTodos();
}
