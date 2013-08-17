package br.edu.pos.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = -5252579234008550725L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "produtoGenerator")
	@TableGenerator(name = "produtoGenerator", initialValue = 1, allocationSize = 1)
	private Long codigo;
	
	private String nome;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
