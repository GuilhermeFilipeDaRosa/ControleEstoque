package br.com.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.estoque.dao.MovimentoEstoqueDao;
import br.com.estoque.dao.ProdutoDao;
import br.com.estoque.model.MovimentoEstoque;
import br.com.estoque.model.Produto;

@Controller
public class MovimentoEstoqueController {
	@Autowired
	private MovimentoEstoqueDao movimentoEstoqueRepositorio;
	
	@Autowired
	private ProdutoDao produtoRepositorio;
	
	@PostMapping("/inserirMovimentacao")
	public ModelAndView inserirMovimentacao(MovimentoEstoque movimentoEstoque) {
		ModelAndView mv = new ModelAndView();
		
		Produto produto = produtoRepositorio.getById(movimentoEstoque.getCodigoProduto());
		
		if(movimentoEstoque.getTipoMovimentacao().trim().equals("S")) {
//			if(produto.getQtde_estoque() > movimentoEstoque.getQuantidadeMovimentada()) {
//				esta dando erro
//				produtoRepositorio.atualizarQtdeEstoque(movimentoEstoque.getQuantidadeMovimentada() - produto.getQtde_estoque(), produto.getCodigo());
				movimentoEstoqueRepositorio.save(movimentoEstoque);
				mv.setViewName("redirect:/produtosAdicionados");
//			} else if (produto.getCodigo() != null){
//				mv.setViewName("redirect:/produtoSemSaldo");
//			}
		}else {
//			esta dando erro
//			produtoRepositorio.atualizarQtdeEstoque((movimentoEstoque.getQuantidadeMovimentada() + produto.getQtde_estoque()), produto.getCodigo());
			movimentoEstoqueRepositorio.save(movimentoEstoque);
			mv.setViewName("redirect:/produtosAdicionados");
		}
		
		
		return mv;
	}
	
	@GetMapping("/movimentacao")
	public ModelAndView listarMovimentacao() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MovimentoEstoque/movimentacao");
		mv.addObject("dados", movimentoEstoqueRepositorio.findAll());
		return mv;
	}
}
