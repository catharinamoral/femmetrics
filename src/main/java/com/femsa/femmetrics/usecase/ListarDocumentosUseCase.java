package com.femsa.femmetrics.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.femsa.femmetrics.dataprovider.respository.DocumentosRepository;
import com.femsa.femmetrics.dataprovider.respository.entity.DocumentosEntity;
import com.femsa.femmetrics.usecase.domain.response.DocumentosDomainResponse;
import com.femsa.femmetrics.usecase.mapper.DocumentosDomainResponseMapper;

@Component
public class ListarDocumentosUseCase {
	
	@Autowired
	private DocumentosRepository documentosRepository;

	public DocumentosDomainResponse listar(String idFornecedor) {
	
		Optional<DocumentosEntity> entity = documentosRepository.findByIdFornecedor(idFornecedor);
		
		if(entity.isEmpty()){
			return null;
		}
		
		return DocumentosDomainResponseMapper.toDomain(entity.get());
	}

}
