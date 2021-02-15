package com.example.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//Voiture n est pas destine a etre instancie ms declare des methodes de fabrique @Configuration
public class Voiture implements Vehicule {
	
	public static int number = 5 ;

	@Override
	public String louer() {
		return ("loue la voiture " + number);
	}

}
