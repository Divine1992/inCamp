package net.divine.polymorphism;

public class TanCalculator extends Calculator {

	@Override
	void angle(double a) {
		if (a == 90 || a == 270) {
			System.out.println("tan: does not exist");
		} else {
			a = Math.toRadians(a);
			System.out.println("tan: " + Math.round(Math.tan(a)));
		}
	}

}
