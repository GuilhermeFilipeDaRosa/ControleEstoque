package br.com.estoque.enums;

public enum TipoMovimentacao {
	ENTRADA("Entrada"),
	SAIDA("Saida");
	
	private String tipoMovimentacao;
	
	private TipoMovimentacao(String tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
}
