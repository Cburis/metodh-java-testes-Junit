package br.com.sprint4.capegmini;

public class FinanciamentoCelular {
	
	private String modeloCelular;
	private Double valorCelular;
	private Integer numeroParcela;
	private Double valorParcela;
	private Integer score;
	
	 
	public FinanciamentoCelular(String modeloCelular, Double valorCelular, Integer numeroParcela) {
		this.modeloCelular = modeloCelular;
		this.valorCelular = valorCelular;
		this.numeroParcela = numeroParcela;
	}
	
	 
	public FinanciamentoCelular() {
		
	}
	 
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getModeloCelular() {
		return modeloCelular;
	}

	public void setModeloCelular(String modeloCelular) {
		this.modeloCelular = modeloCelular;
	}

	public Double getValorCelular() {
		return valorCelular;
	}

	public void setValorCelular(Double valorCelular) {
		this.valorCelular = valorCelular;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	
	
	
}
