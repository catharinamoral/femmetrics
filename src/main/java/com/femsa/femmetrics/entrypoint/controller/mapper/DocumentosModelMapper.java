package com.femsa.femmetrics.entrypoint.controller.mapper;

import com.femsa.femmetrics.commons.model.DataModelResponse;
import com.femsa.femmetrics.usecase.domain.response.DocumentosDomainResponse;

public class DocumentosModelMapper {

	public static DataModelResponse<DocumentosDomainResponse> toDto(DocumentosDomainResponse domainResponse) {
		
		DataModelResponse<DocumentosDomainResponse> dataModelResponse = new DataModelResponse<>();
		dataModelResponse.setData(domainResponse);
		return dataModelResponse;
	}

}
