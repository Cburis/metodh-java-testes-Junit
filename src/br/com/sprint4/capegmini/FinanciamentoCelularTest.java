package br.com.sprint4.capegmini;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FinanciamentoCelularTest {

	/**
	 *Esse testa ele ta testando o retorno de aprovado de acordo
	 * com o score do metodo Validar pedido
	 */
	@Test
	void testeRetornaAprovado() {
		 
		FinanciamentoCelular cel = new FinanciamentoCelular("Pixel 3",8999.00, 10);
		ControllerFinanciamentoCelular teste = new ControllerFinanciamentoCelular(cel);
		cel.setScore(800);
		boolean score1 = teste.validarPedido();
		String valorParcela = teste.calculoAprovado(score1);
		Assert.assertEquals("APROVADO!", valorParcela);
	} 
	/**
	 * Esse teste retorna se o teste retorna um uma negação
	 */
	@Test
	void testeRetornaReprovado() {
		 
		FinanciamentoCelular cel = new FinanciamentoCelular("Pixel 3",8999.00, 10);
		ControllerFinanciamentoCelular teste = new ControllerFinanciamentoCelular(cel);
		cel.setScore(250);
		boolean score1 = teste.validarPedido();
		String valorParcela = teste.calculoAprovado(score1);
		Assert.assertEquals("Financiamento não disponivel no momento", valorParcela);
	} 
	
	/**
	 * Esses teste ele testa o valor retornado da parcela
	 * e valida se a operação está correta
	 */
	@Test
	void testeRetornaValorParcela() {
		 
		FinanciamentoCelular cel = new FinanciamentoCelular("Pixel 3",8999.00, 10);
		ControllerFinanciamentoCelular teste = new ControllerFinanciamentoCelular(cel);
		double teste12 = teste.calculaParcelas();
		Assert.assertEquals(899.90, teste12, 000.1);
	} 
	/**
	 * Teste pra ver se retonar boolean False do metodo do ValidarPedido
	 */
	@Test
	void testeRetornaBooleanFalse() {
		 
		FinanciamentoCelular cel = new FinanciamentoCelular("Pixel 3",4060.00, 10);
		ControllerFinanciamentoCelular teste = new ControllerFinanciamentoCelular(cel);
		cel.setScore(300);
		boolean score = teste.validarPedido();
		Assert.assertEquals(false, score);
	} 
	/**
	 * Teste pra ver se retonar boolean True do metodo do ValidarPedido
	 */
	@Test
	void testeRetornaBooleanTrue() {
		 
		FinanciamentoCelular cel = new FinanciamentoCelular("Pixel 3",4000.00, 10);
		ControllerFinanciamentoCelular teste = new ControllerFinanciamentoCelular(cel);
		cel.setScore(700);
		boolean score = teste.validarPedido();
		Assert.assertEquals(true, score);
	} 
	
  
}
