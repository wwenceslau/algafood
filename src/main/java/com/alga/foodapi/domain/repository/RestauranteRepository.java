package com.alga.foodapi.domain.repository;

import java.util.List;

import com.alga.foodapi.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante entity);
	void remover(Restaurante entity);
	
}
