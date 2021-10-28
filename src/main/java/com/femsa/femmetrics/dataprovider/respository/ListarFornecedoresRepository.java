package com.femsa.femmetrics.dataprovider.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.femsa.femmetrics.dataprovider.respository.entity.FornecedorEntity;

@Repository
public interface ListarFornecedoresRepository extends JpaRepository<FornecedorEntity, String>{

}
