package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Camion implements Vehicule  {

	public static int number = 2 ;

	@Override
	public String louer() {
		return ("loue la voiture " + number);
	}

}
