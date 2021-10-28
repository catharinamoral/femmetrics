package com.femsa.femmetrics.dataprovider.respository.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "FORNECEDOR")
public class FornecedorEntity implements Serializable {

	private static final long serialVersionUID = -3794253845316184040L;

	@Id
	@Column(name = "IDT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NaturalId
	@Column(name = "ID_FORNECEDOR")
	private String idFornecedor;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
	@Column(name = "RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(name = "CNPJ")
	private String cnpj;

	@Column(name = "CATEGORIA")
	private String categoria;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "QTD_FUNCIONARIOS")
	private Integer quantidadeFuncionarios;
	
	@Column(name = "ULTIMA_COMPRA")
	private LocalDateTime ultimaCompra;
	
	@Column(name = "SITUACAO")
	private String situacao;

}
