package com.alga.foodapi.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alga.foodapi.AlgaFoodApiApplication;
import com.alga.foodapi.domain.model.Restaurante;
import com.alga.foodapi.domain.repository.RestauranteRepository;

public class BuscarRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante = new Restaurante();
		
		restaurante = restauranteRepository.buscar(1L);

		System.out.printf("%d - %s - %s\n", restaurante.getId(), restaurante.getNome(), restaurante.getTaxaFrete());
	    
		
	}

}
