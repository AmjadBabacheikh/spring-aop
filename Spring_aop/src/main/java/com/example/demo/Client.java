package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
	public static int number = 4;
	

	private Vehicule vehicule;
	
	@Autowired
	public Client(Vehicule vehicule) {
		this.vehicule=vehicule;
	}
//	@Autowired
//	public void setVehicule(Vehicule vehicule) {
//		this.vehicule = vehicule;
//	}

	public void louer_vehicule() {
		System.out.println(String.format("Le client n.%1$d %2$s", number, vehicule.louer()));
	}
}
