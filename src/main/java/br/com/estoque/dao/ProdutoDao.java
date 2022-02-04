package br.com.estoque.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.estoque.model.Produto;
import br.com.estoque.model.ProdutoTipoQuantidade;

public interface ProdutoDao extends JpaRepository<Produto, Integer> {
	 @Transactional
	@Modifying
	@Query(" update Produto p set p.qtde_estoque = :qtde where p.codigo = :codigo")
	public List<ProdutoTipoQuantidade> atualizarQtdeEstoque(@Param("qtde") Double qtde, @Param("codigo") Integer codigo);
}
