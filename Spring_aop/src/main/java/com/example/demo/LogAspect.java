package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution (public * com.example.demo.*Client.*(..))")
	public void methodCall() {
		// cette methode ne sera pas appele,mais va servir comme pointcut pour les advices definis
		// sera invoque avec le nom de la methode
		// sera applique sur tous les methodes retournant n importe quoi et qui sont localises dans le 
		// package com.example.demo et leurs classe se termine par Client et contenant n importe quels parametres
	}

	@Before("methodCall()")
	public void log(JoinPoint joinPoint) {
		System.out.printf("Appel de %s avec %d paramètres%n", joinPoint.toShortString(), joinPoint.getArgs().length);
		//log est un advice
	}

	@AfterThrowing(pointcut = "methodCall()", throwing = "e")
	public void log(JoinPoint joinPoint, Throwable e) {
		//cet advice sera execute que pour les methodes retournant des exceptions a la fin
		//on utilise l attribut throwing pour recuperer l exception
		System.out.printf("Retour de %s avec une exception %s%n", joinPoint.toShortString(),
				e.getClass().getSimpleName());
	}

}
