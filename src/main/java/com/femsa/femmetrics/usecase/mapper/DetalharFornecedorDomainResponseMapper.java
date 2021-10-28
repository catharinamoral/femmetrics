package com.femsa.femmetrics.usecase.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.femsa.femmetrics.dataprovider.respository.entity.FornecedorEntity;
import com.femsa.femmetrics.usecase.domain.response.DetalharFornecedorDomainResponse;

public class DetalharFornecedorDomainResponseMapper {

	public static DetalharFornecedorDomainResponse toDomain(FornecedorEntity entity) {

		return DetalharFornecedorDomainResponse.builder()
				.id(entity.getIdFornecedor())
				.nomeFantasia(entity.getNomeFantasia())
				.razaoSocial(entity.getRazaoSocial())
				.cnpj(entity.getCnpj())
				.categoria(entity.getCategoria())
				.telefone(entity.getTelefone())
				.email(entity.getEmail())
				.quantidadeFuncionarios(entity.getQuantidadeFuncionarios())
				.ultimaCompra(entity.getUltimaCompra())
				.situacao(entity.getSituacao())
				.build();
	}
	
	public static List<DetalharFornecedorDomainResponse> toDomainLista(List<FornecedorEntity> entity) {

		return entity.stream()
				.map(item -> toDomainListar(item))
				.collect(Collectors.toList());
	}
	
	private static DetalharFornecedorDomainResponse toDomainListar(FornecedorEntity entity) {
		return DetalharFornecedorDomainResponse.builder()
				.id(entity.getIdFornecedor())
				.nomeFantasia(entity.getNomeFantasia())
				.cnpj(entity.getCnpj())
				.categoria(entity.getCategoria())
				.situacao(entity.getSituacao())
				.build();
	}


}
