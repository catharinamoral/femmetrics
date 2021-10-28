package com.femsa.femmetrics.usecase.domain.response;

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
public class DocumentosDomainResponse {

	private String idFornecedor;
	
	private boolean fichaCadastral;

	private boolean cadastroSocial;

	private boolean sintegra;
	
	private boolean contaBancaria;
	
}
