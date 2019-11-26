package com.alga.foodapi.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alga.foodapi.AlgaFoodApiApplication;
import com.alga.foodapi.domain.model.Cozinha;
import com.alga.foodapi.domain.repository.CozinhaRepository;

public class BuscarCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				          .web(WebApplicationType.NONE)
				          .run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cozinhaRepository.buscar(1L);
		
		System.out.println(cozinha.getNome());
		
	}

}
