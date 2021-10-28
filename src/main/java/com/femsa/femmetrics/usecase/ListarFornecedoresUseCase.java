package com.femsa.femmetrics.usecase;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.femsa.femmetrics.dataprovider.respository.ListarFornecedoresRepository;
import com.femsa.femmetrics.dataprovider.respository.entity.FornecedorEntity;
import com.femsa.femmetrics.usecase.domain.response.DetalharFornecedorDomainResponse;
import com.femsa.femmetrics.usecase.mapper.DetalharFornecedorDomainResponseMapper;

@Component
public class ListarFornecedoresUseCase {
	
	@Autowired
	private ListarFornecedoresRepository listarFornecedorRepository;

	public List<DetalharFornecedorDomainResponse> listar(String categoria, String situacao) {
		
		List<FornecedorEntity> entity = listarFornecedorRepository.findAll();
		
		if(entity.isEmpty()){
			return null;
		}
	
		if(categoria != null && situacao != null) {
			List<FornecedorEntity> listaFiltrada = entity.stream()
			.filter(item -> item.getCategoria().equals(categoria.toLowerCase()))
			.filter(item -> item.getSituacao().equals(situacao.toUpperCase()))
			.collect(Collectors.toList());
			
			return DetalharFornecedorDomainResponseMapper.toDomainLista(listaFiltrada);
		} else if(categoria != null) {
			
			List<FornecedorEntity> listaFiltradaCategoria = entity.stream()
			.filter(item -> item.getCategoria().equals(categoria.toLowerCase()))
			.collect(Collectors.toList());
			
			return DetalharFornecedorDomainResponseMapper.toDomainLista(listaFiltradaCategoria);
		} else if(situacao != null) {
			
			List<FornecedorEntity> listaFiltradaSituacao = entity.stream()
			.filter(item -> item.getSituacao().equals(situacao.toUpperCase()))
			.collect(Collectors.toList());
					
			return DetalharFornecedorDomainResponseMapper.toDomainLista(listaFiltradaSituacao);
		}else {
			return DetalharFornecedorDomainResponseMapper.toDomainLista(entity);
		}
		
		
	}

}
