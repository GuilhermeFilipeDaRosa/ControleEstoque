package br.com.estoque.enums;

public enum Tipo {
	ELETRONICO("Eletronico"),
	ELETRODOMESTICO("Eletrodomestico"),
	MOVEL("Movel");
	
	private String tipo;
	
	private Tipo(String tipo) {
		this.tipo = tipo;
	}
}
