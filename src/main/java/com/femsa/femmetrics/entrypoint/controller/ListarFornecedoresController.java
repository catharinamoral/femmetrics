package com.femsa.femmetrics.entrypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.femsa.femmetrics.commons.model.DataModelResponse;
import com.femsa.femmetrics.entrypoint.controller.mapper.DetalharFornecedorModelMapper;
import com.femsa.femmetrics.usecase.ListarFornecedoresUseCase;
import com.femsa.femmetrics.usecase.domain.response.DetalharFornecedorDomainResponse;

@RestController
@RequestMapping(value = "/v1/femmetrics/fornecedores")
@EnableAutoConfiguration
public class ListarFornecedoresController {

	@Autowired
	private ListarFornecedoresUseCase listarFornecedoresUseCase;
	
	@GetMapping
	public ResponseEntity<DataModelResponse<List<DetalharFornecedorDomainResponse>>> listar(@RequestParam(required=false) String categoria, @RequestParam(required=false) String situacao) {
		
		List<DetalharFornecedorDomainResponse> domainResponse = listarFornecedoresUseCase.listar(categoria, situacao);
		
		if(domainResponse.isEmpty() || domainResponse == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(DetalharFornecedorModelMapper.toDto(domainResponse), HttpStatus.OK);

	}
	
}
