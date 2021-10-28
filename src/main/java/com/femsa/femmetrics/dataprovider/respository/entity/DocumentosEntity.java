package com.femsa.femmetrics.dataprovider.respository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DOCUMENTOS")
public class DocumentosEntity implements Serializable {
	
	private static final long serialVersionUID = 5781483037746809579L;
	
	@Id
	@Column(name = "IDT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NaturalId
	@Column(name = "ID_FORNECEDOR")
	private String idFornecedor;
	
	@Column(name = "FICHA_CADASTRAL")
	private boolean fichaCadastral;
	
	@Column(name = "CADASTRO_SOCIAL")
	private boolean cadastroSocial;
	
	@Column(name = "SINTEGRA")
	private boolean sintegra;
	
	@Column(name = "CONTA_BANCARIA")
	private boolean contaBancaria;

}
