package com.femsa.femmetrics.dataprovider.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.femsa.femmetrics.dataprovider.respository.entity.DocumentosEntity;

@Repository
public interface DocumentosRepository extends JpaRepository<DocumentosEntity, String>{

	Optional<DocumentosEntity> findByIdFornecedor(String idFornecedor);

}
