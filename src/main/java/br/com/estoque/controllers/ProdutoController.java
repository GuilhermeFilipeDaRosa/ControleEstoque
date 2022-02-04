package br.com.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.estoque.dao.ProdutoDao;
import br.com.estoque.model.MovimentoEstoque;
import br.com.estoque.model.Produto;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoDao produtoRepositorio;
	
	@GetMapping("/inserirProdutos")
	public ModelAndView insertProdutos(Produto produto) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Produto/formProduto");
		mv.addObject("produto", new Produto());
		return mv;
	}
	
	@PostMapping("/insertProdutos")
	public ModelAndView inserirProduto(Produto produto) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/produtosAdicionados");
		produtoRepositorio.save(produto);
		return mv;
	}
	
	@GetMapping("/produtosAdicionados")
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Produto/listaProdutos");
		mv.addObject("produtos", produtoRepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/alterar/{id}")
	public ModelAndView alterar(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Produto/altera");
		Produto produto = produtoRepositorio.getById(id);
		mv.addObject("produto", produto);
		return mv;
	}
	
	@PostMapping("/alterar")
	public ModelAndView alterar(Produto produto) {
		ModelAndView mv = new ModelAndView();
		produtoRepositorio.save(produto);
		mv.setViewName("redirect:/produtosAdicionados");
		
		return mv;
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Integer id) {
	    produtoRepositorio.deleteById(id);
		return "redirect:/produtosAdicionados";
	}
	
	
	@GetMapping("/movimentar/{id}")
	public ModelAndView movimentar(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MovimentoEstoque/movimentoEstoque");
		mv.addObject("movimentoEstoque",  new MovimentoEstoque());
		mv.addObject("id", id);
		return mv;
	}
	
	@GetMapping("/produtoSemSaldo")
	public ModelAndView avisarProdutoSemSaldo() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Produto/semSaldo");

		return mv;
	}
}
