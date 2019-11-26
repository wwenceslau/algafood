package com.alga.foodapi.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alga.foodapi.AlgaFoodApiApplication;
import com.alga.foodapi.domain.model.Cozinha;
import com.alga.foodapi.domain.repository.CozinhaRepository;

public class InclusaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
	    CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
	    
	    Cozinha cozinha1 = new Cozinha();
	    cozinha1.setNome("Brasileira");

	    Cozinha cozinha2 = new Cozinha();
	    cozinha2.setNome("Japoneza");
	    
	    cozinha1 = cozinhaRepository.salvar(cozinha1);
	    cozinha2 = cozinhaRepository.salvar(cozinha2);
	    
	    System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
	    System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());


	}

}
