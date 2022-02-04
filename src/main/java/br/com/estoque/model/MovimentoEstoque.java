package br.com.estoque.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.estoque.enums.Tipo;
import br.com.estoque.enums.TipoMovimentacao;

@Entity
public class MovimentoEstoque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigoMovimentacao;
	
	@Column(name = "codigoProduto")
	private Integer codigoProduto;
	
	@Column(name = "tipoMovimentacao")
//	@Enumerated(EnumType.STRING)
	private String tipoMovimentacao;// E - ENTRADA, S - SAÍDA
	
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "quantidadeMovimentada")
	private Double quantidadeMovimentada;

	public Integer getCodigoMovimentacao() {
		return codigoMovimentacao;
	}

	public void setCodigoMovimentacao(Integer codigoMovimentacao) {
		this.codigoMovimentacao = codigoMovimentacao;
	}

	public Integer getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(String tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}



	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getQuantidadeMovimentada() {
		return quantidadeMovimentada;
	}

	public void setQuantidadeMovimentada(Double quantidadeMovimentada) {
		this.quantidadeMovimentada = quantidadeMovimentada;
	}
}
