package br.com.silen.clientes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cliente")
@Entity
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "endereco_numero")
	private String enderecoNumero;

	@Column(name = "endereco_complemento")
	private String enderecoComplemento;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cep")
	private String cep;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "estado")
	private String estado;

	public Long getId() {
		return id;
	}
	
	@Deprecated //Hibernate eyes only
	Client() {}
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEnderecoNumero() {
		return enderecoNumero;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
