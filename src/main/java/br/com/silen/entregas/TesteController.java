package br.com.silen.entregas;

import org.springframework.composed.web.Get;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@Get("/teste")
	public Teste getTest() {
		return new Teste();	
	}
}
