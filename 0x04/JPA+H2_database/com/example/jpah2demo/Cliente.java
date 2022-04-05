package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String idade;
	private String email;
	
	@OneToMany
	private List<Telefone> fone;
	@OneToMany
	private List<Endereco> endereco;	
	
	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, String idade, String email, List<Telefone> fone, List<Endereco> endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getFone() {
		return fone;
	}

	public void setFone(List<Telefone> fone) {
		this.fone = fone;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

}
