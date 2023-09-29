package org.kaly.dao;

import org.junit.Test;
import org.kaly.domain.Curso;
import org.kaly.domain.Produto;

import static org.junit.Assert.assertNotNull;

public class ProdutoDaoTest  {

    private IProdutoDao produtoDao;

    public ProdutoDaoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("XXX");
        produto.setDescricao("Aula de JPA");
        produto.setNome("Aula Particular");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }

}