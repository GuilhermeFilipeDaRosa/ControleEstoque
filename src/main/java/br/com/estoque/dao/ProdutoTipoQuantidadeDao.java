package br.com.estoque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.estoque.model.MovimentoEstoque;
import br.com.estoque.model.ProdutoTipoQuantidade;

public interface ProdutoTipoQuantidadeDao extends JpaRepository<ProdutoTipoQuantidade, Integer>{
	String sqlCompleta = ""
			+ " SELECT P.codigo as codigoTipoQuantidade,"
			+ "        P.codigo,"
			+ "        P.descricao,"
			+ "        'Saída' AS tipo,"
			+ "        P.qtde_estoque,"
			+ "        SUM(M.quantidadeMovimentada) AS quantidadeMovimentada"
			+ " FROM Produto P"
			+ " INNER JOIN MovimentoEstoque M ON (M.codigoProduto = P.codigo)"
			+ " WHERE M.tipoMovimentacao = 'S'"
			+ " GROUP BY P.codigo, P.descricao, P.qtde_estoque"
			+ " ORDER BY P.codigo";
	
//	""
//	+ " select m "
//	+ " from MovimentoEstoque m"
	//
	@Query(sqlCompleta)
	public List<ProdutoTipoQuantidade> retornarProdutoTipoQuantidades();
}
