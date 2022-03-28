package br.com.victor.fernandes.pw3hasfoodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_CARDAPIO")
public class Cardapio {

	@Column (name="ID_CARDAPIO")
	private long idCardapio;
	
	@Column(name="ID_RESTAURANTE")
	private long idRestaurante;
}
