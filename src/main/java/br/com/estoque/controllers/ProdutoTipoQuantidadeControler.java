package br.com.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.estoque.dao.MovimentoEstoqueDao;
import br.com.estoque.dao.ProdutoTipoQuantidadeDao;
import br.com.estoque.model.MovimentoEstoque;


@Controller
public class ProdutoTipoQuantidadeControler {
	
	
	@Autowired
	private ProdutoTipoQuantidadeDao produtoTipoQuantidadeRepositorio;
	
	@GetMapping("/listarPorTipoQuantidade")
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("consultas/consulta1");
		mv.addObject("produtos", produtoTipoQuantidadeRepositorio.retornarProdutoTipoQuantidades());
		return mv;
	}
}
