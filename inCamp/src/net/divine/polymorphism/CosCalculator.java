package net.divine.polymorphism;

public class CosCalculator extends Calculator {

	@Override
	void angle(double a) {
		a = Math.toRadians(a);
		System.out.println("cos: " + Math.round(Math.cos(a)));
	}
	
}
