package com.femsa.femmetrics.entrypoint.controller.mapper;

import java.util.List;

import com.femsa.femmetrics.commons.model.DataModelResponse;
import com.femsa.femmetrics.usecase.domain.response.DetalharFornecedorDomainResponse;

public class DetalharFornecedorModelMapper {
	
	public static DataModelResponse<DetalharFornecedorDomainResponse> toDto(DetalharFornecedorDomainResponse conteudoDomainResponses){
		
		DataModelResponse<DetalharFornecedorDomainResponse> dataModelResponse = new DataModelResponse<>();
		dataModelResponse.setData(conteudoDomainResponses);
		return dataModelResponse;
	}
	
	public static DataModelResponse<List<DetalharFornecedorDomainResponse>> toDto(List<DetalharFornecedorDomainResponse> conteudoDomainResponses){
		
		DataModelResponse<List<DetalharFornecedorDomainResponse>> dataModelResponse = new DataModelResponse<>();
		dataModelResponse.setData(conteudoDomainResponses);
		return dataModelResponse;
	}
	
}
