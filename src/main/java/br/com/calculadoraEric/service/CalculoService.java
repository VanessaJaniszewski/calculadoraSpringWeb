package br.com.calculadoraEric.service;

import org.springframework.stereotype.Service;

import br.com.calculadoraEric.entities.Operacao;
import br.com.calculadoraEric.entities.Operadores;
import br.com.calculadoraEric.exceptions.OperadorInvalido;

@Service
public class CalculoService {
	
	public Operadores calcular(Operadores operadores) throws OperadorInvalido {
		Double answer = null;
		Double A = operadores.getOperandoA();
		Double B = operadores.getOperandoB();
		String operador = operadores.getOperador();
		if(operador.equalsIgnoreCase("-")) {
			answer = (A - B);
			operadores.setDescricaoOperação(Operacao.SUBTRACAO);;
		}else if(operador.equalsIgnoreCase("*")) {
			answer = (A*B);
			operadores.setDescricaoOperação(Operacao.MULTIPLICACAO);
		}else if (operador.equalsIgnoreCase("+")) {
			answer = (A+B);
			operadores.setDescricaoOperação(Operacao.ADICAO);
		}else {
			throw new OperadorInvalido("Operador Inválido.");
		}
		operadores.setBinario(Integer.toBinaryString(answer.intValue()));
		operadores.setResultado(answer);
		return operadores;
	}

}
