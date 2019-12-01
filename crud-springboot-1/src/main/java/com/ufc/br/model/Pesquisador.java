package com.ufc.br.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class Pesquisador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigoPesquisador;

	@NotBlank(message = "Preencha o RG do Pesquisador")
	private String rgPesquisador;
	
	@NotBlank(message = "Preencha o CPF do Pesquisador")
	private String cpfPesquisador;
	
	@NotBlank(message = "Preencha o NOME do Pesquisador")
	private String nomePesquisador;
	
	@NotBlank(message = "Preencha o SEXO do Pesquisador")
	private String sexoPesquisador;
	
	@NotBlank(message = "Preencha o SEXO do Pesquisador")
	private String instAlcan;
	
	@NotBlank(message = "Preencha o DATA DE NASCIMENTO do Pesquisador")
	private String dataNacPesquisador;
	
	@NotBlank(message = "Preencha o GRAU do Pesquisador")
	private String grauPesquisador;

	
	public Long getCodigoPesquisador() {
		return codigoPesquisador;
	}
	public void setCodigoPesquisador(Long codigoPesquisador) {
		this.codigoPesquisador = codigoPesquisador;
	}
	public String getRgPesquisador() {
		return rgPesquisador;
	}
	public void setRgPesquisador(String rgPesquisador) {
		this.rgPesquisador = rgPesquisador;
	}
	public String getCpfPesquisador() {
		return cpfPesquisador;
	}
	public void setCpfPesquisador(String cpfPesquisador) {
		this.cpfPesquisador = cpfPesquisador;
	}
	public String getNomePesquisador() {
		return nomePesquisador;
	}
	public void setNomePesquisador(String nomePesquisador) {
		this.nomePesquisador = nomePesquisador;
	}
	public String getSexoPesquisador() {
		return sexoPesquisador;
	}
	public void setSexoPesquisador(String sexoPesquisador) {
		this.sexoPesquisador = sexoPesquisador;
	}
	public String getDataNacPesquisador() {
		return dataNacPesquisador;
	}
	public void setDataNacPesquisador(String dataNacPesquisador) {
		this.dataNacPesquisador = dataNacPesquisador;
	}
	public String getGrauPesquisador() {
		return grauPesquisador;
	}
	public void setGrauPesquisador(String grauPesquisador) {
		this.grauPesquisador = grauPesquisador;
	}
	public String getInstAlcan() {
		return instAlcan;
	}
	public void setInstAlcan(String instAlcan) {
		this.instAlcan = instAlcan;
	}
	


}
