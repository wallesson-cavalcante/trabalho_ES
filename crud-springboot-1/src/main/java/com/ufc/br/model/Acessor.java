package com.ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Acessor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigoAcessor;
	
	@NotBlank(message = "Preencha o RG do Acessor")
	private String rgAcessor;
	
	@NotBlank(message = "Preencha o CPF do Acessor")
	private String cpfAcessor;
	
	@NotBlank(message = "Preencha o NOME do Acessor")
	private String nomeAcessor;
	
	@NotBlank(message = "Preencha o SEXO do Acessor")
	private String sexoAcessor;
	
	@NotBlank(message = "Preencha o DATA DE NASCIMENTO do Acessor")
	private String dataNacAcessor;
	
	@NotBlank(message = "Preencha o GRAU do Acessor")
	private String grauAcessor;
	/*
	@NotBlank(message = "Preencha a SENHA do Acessor")
	private String senhaA;
	*/
	
	
	public Long getCodigoAcessor() {
		return codigoAcessor;
	}
	public void setCodigoAcessor(Long codigoAcessor) {
		this.codigoAcessor = codigoAcessor;
	}
	public String getRgAcessor() {
		return rgAcessor;
	}
	public void setRgAcessor(String rgAcessor) {
		this.rgAcessor = rgAcessor;
	}
	public String getCpfAcessor() {
		return cpfAcessor;
	}
	public void setCpfAcessor(String cpfAcessor) {
		this.cpfAcessor = cpfAcessor;
	}
	public String getNomeAcessor() {
		return nomeAcessor;
	}
	public void setNomeAcessor(String nomeAcessor) {
		this.nomeAcessor = nomeAcessor;
	}
	public String getSexoAcessor() {
		return sexoAcessor;
	}
	public void setSexoAcessor(String sexoAcessor) {
		this.sexoAcessor = sexoAcessor;
	}
	public String getDataNacAcessor() {
		return dataNacAcessor;
	}
	public void setDataNacAcessor(String dataNacAcessor) {
		this.dataNacAcessor = dataNacAcessor;
	}
	public String getGrauAcessor() {
		return grauAcessor;
	}
	public void setGrauAcessor(String grauAcessor) {
		this.grauAcessor = grauAcessor;
	}
	
	/*
	public String getSenhaA() {
		return senhaA;
	}
	public void setSenhaA(String senhaA) {
		this.senhaA = senhaA;
	}	
	*/
	
}
