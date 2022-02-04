package br.com.estoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoTipoQuantidade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigoTipoQuantidade;
	
	@Column(name = "codigo")
	private Integer codigo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "qtde_estoque")
	private Double qtde_estoque;
	
	@Column(name = "quantidadeMovimentada")
	private Double quantidadeMovimentada;

	public Integer getCodigoTipoQuantidade() {
		return codigoTipoQuantidade;
	}

	public void setCodigoTipoQuantidade(Integer codigoTipoQuantidade) {
		this.codigoTipoQuantidade = codigoTipoQuantidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getQtde_estoque() {
		return qtde_estoque;
	}

	public void setQtde_estoque(Double qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}

	public Double getQuantidadeMovimentada() {
		return quantidadeMovimentada;
	}

	public void setQuantidadeMovimentada(Double quantidadeMovimentada) {
		this.quantidadeMovimentada = quantidadeMovimentada;
	}
	
	
}
