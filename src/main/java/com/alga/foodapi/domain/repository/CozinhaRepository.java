package com.alga.foodapi.domain.repository;

import java.util.List;

import com.alga.foodapi.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha entity);
	void remover(Cozinha entity);
	
}
