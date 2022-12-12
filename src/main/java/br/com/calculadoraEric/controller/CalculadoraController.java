package br.com.calculadoraEric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.calculadoraEric.entities.Operadores;
import br.com.calculadoraEric.exceptions.OperadorInvalido;
import br.com.calculadoraEric.service.CalculoService;

@RestController
@RequestMapping(value = "/calculadora/operacao")
public class CalculadoraController {
	
	@Autowired
	private CalculoService calculoService;

	@PostMapping
	public ResponseEntity<?> calcular(@RequestBody Operadores operadores) {
		System.out.println(operadores.getOperandoA());
		System.out.println(operadores.getOperandoB());
		System.out.println(operadores.getOperador());
		try {
			Operadores answer = calculoService.calcular(operadores);
	
				return ResponseEntity.ok().body(answer);
			}
			catch (OperadorInvalido e) {
			return ResponseEntity.badRequest().body(e.getMessage());
			
		}
		}}
	


	
	
