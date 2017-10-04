package br.com.silen.entregas;

public class Entrega  {
	
	private int idEntrega;
	private int idRemetente;
	private int idDestinatario;
	private int quantidade;
	private int peso;
	private String contato;
	private String telefone;
	private int idStatus;
	private int idTipo;
	private String dataEnvio;
	private String dataRetirada;
	private boolean ativo;
	private String usuarioCriacao;
	
//	private Cliente remetente;
//	private Cliente destinatario; 	
//	private String entregador;

	
	public Entrega() {
	}
	
	public Entrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	
	/*public Entregas(int idEntregas) {
		setIdEntregas(idEntregas);
	}
	public Entregas(int idRemetente, int idDestinatario, int quantidade, double peso, String contato, String entregador, String telefone, int idStatus, int idTipoEntrega, String dataEnvio, String dataRetirada, int usuarioCriacao) {
		setIdEntregas(idEntregas);
		setRemetente(remetente);
		setDestinatario(destinatario);
		setQuantidade(quantidade);
		setPeso(peso);
		setEntregador(entregador);
		setContato(contato);
		setTelefone(telefone);
		setIdStatus(idStatus);
		setIdTipoEntrega(idTipoEntrega);
		setDataEnvio(dataEnvio);
		setDataRetirada(dataRetirada);
		setUsuarioCriacao(usuarioCriacao);
	}*/

	public int getIdEntrega() {
		return idEntrega;
	}

	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}

//	public Cliente getRemetente() {
//		return remetente;
//	}

//	public void setRemetente(Cliente remetente) {
//		this.remetente = remetente;
//	}

//	public Cliente getDestinatario() {
//		return destinatario;
//	}

//	public void setDestinatario(Cliente destinatario) {
//		this.destinatario = destinatario;
//	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

//	public int getIdTipoEntrega() {
//		return idTipoEntrega;
//	}

//	public void setIdTipoEntrega(int idTipoEntrega) {
//		this.idTipoEntrega = idTipoEntrega;
//	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

//	public String getEntregador() {
//		return entregador;
//	}

//	public void setEntregador(String entregador) {
//		this.entregador = entregador;
//	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdRemetente() {
		return idRemetente;
	}

	public void setIdRemetente(int idRemetente) {
		this.idRemetente = idRemetente;
	}

	public int getIdDestinatario() {
		return idDestinatario;
	}

	public void setIdDestinatario(int idDestinatario) {
		this.idDestinatario = idDestinatario;
	}
	
	
}