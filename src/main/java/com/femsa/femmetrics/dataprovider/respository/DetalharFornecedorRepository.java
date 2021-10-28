package com.femsa.femmetrics.dataprovider.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.femsa.femmetrics.dataprovider.respository.entity.FornecedorEntity;

@Repository
public interface DetalharFornecedorRepository extends JpaRepository<FornecedorEntity, String>{

	Optional<FornecedorEntity> findByIdFornecedor(String idFornecedor);

}
