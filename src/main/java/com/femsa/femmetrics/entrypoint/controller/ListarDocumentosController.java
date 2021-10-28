package com.femsa.femmetrics.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.femsa.femmetrics.commons.model.DataModelResponse;
import com.femsa.femmetrics.entrypoint.controller.mapper.DocumentosModelMapper;
import com.femsa.femmetrics.usecase.ListarDocumentosUseCase;
import com.femsa.femmetrics.usecase.domain.response.DocumentosDomainResponse;

@RestController
@RequestMapping(value = "/v1/femmetrics/fornecedores/{id_fornecedor}/documentos")
@EnableAutoConfiguration
public class ListarDocumentosController {
	
	@Autowired
	private ListarDocumentosUseCase listarDocumentosUseCase;
	
	@GetMapping
	public ResponseEntity<DataModelResponse<DocumentosDomainResponse>> findById(@PathVariable("id_fornecedor") String idFornecedor) {
		
		DocumentosDomainResponse domainResponse = listarDocumentosUseCase.listar(idFornecedor);
		
		if(domainResponse == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(DocumentosModelMapper.toDto(domainResponse), HttpStatus.OK);

	}

}
