package br.com.silen.entregas;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.silen.caixa.CaixaRepository;
import br.com.silen.clientes.ClientRespository;

public class EntregaFacade {
	
	@Autowired
	private EntregaRepository entregaRespository;
	@Autowired
	private ClientRespository clientRepository;
	@Autowired
	private CaixaRepository caixaRepository;
	
	
}
