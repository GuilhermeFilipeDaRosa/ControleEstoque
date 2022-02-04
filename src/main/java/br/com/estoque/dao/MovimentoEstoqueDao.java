package br.com.estoque.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import br.com.estoque.model.MovimentoEstoque;

public interface MovimentoEstoqueDao extends JpaRepository<MovimentoEstoque, Integer> {

}
