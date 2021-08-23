package br.com.sprint4.capegmini;
public class ControllerFinanciamentoCelular {
	FinanciamentoCelular cel1;
	public ControllerFinanciamentoCelular(FinanciamentoCelular cel1) {
		this.cel1 = cel1;
	}
	
	
	/**
	 * Metodo que valida o socore do usuario e verifica se
	 * o financiamento do celular vai ser aprovado ou não.
	 * @param score parametro Boolean para validar o score
	 * @return
	 */
	public String calculoAprovado(boolean score) {
		if(score) {
			cel1.setValorParcela(cel1.getValorCelular()/cel1.getNumeroParcela());
			cel1.getValorParcela();
			return "APROVADO!";
		}else {
			return "Financiamento não disponivel no momento";
		} 
	}
	/**
	 * Metodo que calcula o score do usuario retornando false ou true
	 * @return
	 */
	public Boolean validarPedido() {
		if(cel1.getValorCelular() > 4000 && cel1.getScore() < 301) {
			return false;
		}else if(cel1.getValorCelular() > 4000 && cel1.getValorCelular() < 5000 
				&& cel1.getScore() > 301 && cel1.getScore() < 700) {
			return true;
		}else {
			return true;
		}
	}
	/**
	 * Metodo que calcula o valor das parcelas e retorna um double com
	 * valor da parcela
	 * @return
	 */
	public Double calculaParcelas() {
		cel1.setValorParcela(cel1.getValorCelular()/cel1.getNumeroParcela());
		return cel1.getValorParcela();
	}

}
