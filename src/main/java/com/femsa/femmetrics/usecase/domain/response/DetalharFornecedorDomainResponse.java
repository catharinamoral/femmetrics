package com.femsa.femmetrics.usecase.domain.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonNaming(SnakeCaseStrategy.class)
@JsonInclude(Include.NON_NULL)
public class DetalharFornecedorDomainResponse {

	private String id;
	
	private String nomeFantasia;
	
	private String razaoSocial;
	
	private String cnpj;

	private String categoria;
	
	private String telefone;
	
	private String email;
	
	private Integer quantidadeFuncionarios;
	
	private LocalDateTime ultimaCompra;
	
	private String situacao;
	
}
