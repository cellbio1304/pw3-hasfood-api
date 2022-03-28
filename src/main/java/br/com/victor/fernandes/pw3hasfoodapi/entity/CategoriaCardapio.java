package br.com.victor.fernandes.pw3hasfoodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_CATEGORIA_CARDAPIO")
public class CategoriaCardapio {
	
	@Column(name="ID_CATEGORIA_CARDAPIO")
	private long idCategoriaCardapio;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column

}
