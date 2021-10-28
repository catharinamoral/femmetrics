package com.femsa.femmetrics.usecase.mapper;

import com.femsa.femmetrics.dataprovider.respository.entity.DocumentosEntity;
import com.femsa.femmetrics.usecase.domain.response.DocumentosDomainResponse;

public class DocumentosDomainResponseMapper {

	public static DocumentosDomainResponse toDomain(DocumentosEntity documentosEntity) {
		
		return DocumentosDomainResponse.builder()
				.idFornecedor(documentosEntity.getIdFornecedor())
				.fichaCadastral(documentosEntity.isFichaCadastral())
				.cadastroSocial(documentosEntity.isCadastroSocial())
				.sintegra(documentosEntity.isSintegra())
				.contaBancaria(documentosEntity.isContaBancaria())
				.build();
	}

}
