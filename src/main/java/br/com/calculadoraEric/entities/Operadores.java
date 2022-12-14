package br.com.calculadoraEric.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operadores {
	
	private Double operandoA;
	private Double OperandoB;
	private String operador;
	private Operacao descricaoOperação;
	private Double resultado;
	private String binario;

}
