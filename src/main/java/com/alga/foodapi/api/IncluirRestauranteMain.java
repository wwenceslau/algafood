package com.alga.foodapi.api;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alga.foodapi.AlgaFoodApiApplication;
import com.alga.foodapi.domain.model.Restaurante;
import com.alga.foodapi.domain.repository.RestauranteRepository;

public class IncluirRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNome("Budega do Preto");
		restaurante.setTaxaFrete(new BigDecimal("15.00"));
		
		restaurante = restauranteRepository.salvar(restaurante);
		
		System.out.printf("%d - %s - %s\n", restaurante.getId(), restaurante.getNome(), restaurante.getTaxaFrete());
	    

	}

}
