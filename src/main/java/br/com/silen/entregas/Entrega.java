package br.com.silen.entregas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.silen.caixa.Caixa;
import br.com.silen.clientes.Client;
import br.com.silen.motoboy.Motoboy;

@Entity
@Table(name = "entrega")
public class Entrega {

	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	@JoinColumn(name = "cliente_id")
	private Client cliente;

	@OneToOne
	@JoinColumn(name = "motoboy_id")
	private Motoboy motoboy;

	@OneToOne
	@JoinColumn(name = "caixa_id")
	private Caixa caixa;

	@Column(name = "latitude")
	private Double latitude;

	@Column(name = "longitude")
	private Double longitude;

	@Column(name = "tempo")
	private Double tempo;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private EntregaStatus status;

	@Column(name = "quantidade_caixa")
	private long quantidadeCaixa;

	public Entrega() {
	}

	public Entrega(long id, Client cliente, Motoboy motoboy, Caixa caixa, Double latitude, Double longitude,
			Double tempo, long quantidadeCaixa, EntregaStatus status) {
		this.id = id;
		this.cliente = cliente;
		this.motoboy = motoboy;
		this.caixa = caixa;
		this.latitude = latitude;
		this.longitude = longitude;
		this.tempo = tempo;
		this.quantidadeCaixa = quantidadeCaixa;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public Client getCliente() {
		return cliente;
	}

	public Motoboy getMotoboy() {
		return motoboy;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Double getTempo() {
		return tempo;
	}

	public long getQuantidadeCaixa() {
		return quantidadeCaixa;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public void setMotoboy(Motoboy motoboy) {
		this.motoboy = motoboy;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {	
		this.longitude = longitude;
	}

	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}

	public void setQuantidadeCaixa(long quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}
	
	public EntregaStatus getStatus() {
		return status;
	}
	
	public void setStatus(EntregaStatus status) {
		this.status = status;
	}

}