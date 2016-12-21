package net.divine.polymorphism;

public class SinCalculator extends Calculator {

	@Override
	void angle(double a) {
		a = Math.toRadians(a);
		System.out.println("sin: " + Math.round(Math.sin(a)));
	}

}
