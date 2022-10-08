package com.drogaria.farmasantos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.drogaria.farmasantos.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	public List <Produtos> findAllByMarcaContainingIgnoreCase(@Param("marca")
	String titulo);



}