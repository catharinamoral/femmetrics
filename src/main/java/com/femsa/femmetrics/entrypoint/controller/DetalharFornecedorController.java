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
import com.femsa.femmetrics.entrypoint.controller.mapper.DetalharFornecedorModelMapper;
import com.femsa.femmetrics.usecase.DetalharFornecedorUseCase;
import com.femsa.femmetrics.usecase.domain.response.DetalharFornecedorDomainResponse;

@RestController
@RequestMapping(value = "/v1/femmetrics/fornecedores/{id_fornecedor}")
@EnableAutoConfiguration
public class DetalharFornecedorController {

	@Autowired
	private DetalharFornecedorUseCase detalharForncedorUseCase;
	
	@GetMapping
	public ResponseEntity<DataModelResponse<DetalharFornecedorDomainResponse>> findById(@PathVariable("id_fornecedor") String idFornecedor) {
		
		DetalharFornecedorDomainResponse domainResponse = detalharForncedorUseCase.detalhar(idFornecedor);
		
		if(domainResponse == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(DetalharFornecedorModelMapper.toDto(domainResponse), HttpStatus.OK);

	}
	
}
