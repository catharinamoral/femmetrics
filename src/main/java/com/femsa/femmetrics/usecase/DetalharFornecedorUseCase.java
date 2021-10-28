package com.femsa.femmetrics.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.femsa.femmetrics.dataprovider.respository.DetalharFornecedorRepository;
import com.femsa.femmetrics.dataprovider.respository.entity.FornecedorEntity;
import com.femsa.femmetrics.usecase.domain.response.DetalharFornecedorDomainResponse;
import com.femsa.femmetrics.usecase.mapper.DetalharFornecedorDomainResponseMapper;

@Component
public class DetalharFornecedorUseCase {
	
	@Autowired
	private DetalharFornecedorRepository detalharFornecedorRepository;

	public DetalharFornecedorDomainResponse detalhar(String idFornecedor) {
		
		Optional<FornecedorEntity> entity = detalharFornecedorRepository.findByIdFornecedor(idFornecedor);
		
		if(entity.isEmpty()){
			return null;
		}
		
		return DetalharFornecedorDomainResponseMapper.toDomain(entity.get());
	}

}
