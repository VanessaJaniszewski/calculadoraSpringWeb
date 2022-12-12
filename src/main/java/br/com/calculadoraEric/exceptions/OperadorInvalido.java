package br.com.calculadoraEric.exceptions;

public class OperadorInvalido extends Throwable{

		private static final long serialVersionUID = 1L;

		public OperadorInvalido(String mensagem) {
			super(mensagem);
		}
	}

