package br.com.estoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "tipo")
	/*@Enumerated(EnumType.STRING)*/
	private Integer tipo;//1 - Eletronico, 2 - Eletrodomestico, 3 - Movel
	
	@Column(name = "valor_fornecedor")
	private Double valor_fornecedor;
	
	@Column(name = "qtde_estoque")
	private Double qtde_estoque;
	
	
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

	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Double getValor_fornecedor() {
		return valor_fornecedor;
	}
	public void setValor_fornecedor(Double valor_fornecedor) {
		this.valor_fornecedor = valor_fornecedor;
	}
	public Double getQtde_estoque() {
		return qtde_estoque;
	}
	public void setQtde_estoque(Double qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}
}
