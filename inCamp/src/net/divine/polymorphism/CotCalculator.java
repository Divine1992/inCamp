package net.divine.polymorphism;

public class CotCalculator extends Calculator {

	@Override
	void angle(double a) {
		if (a == 0 || a == 180 || a == 360) {
			System.out.println("cot: does not exist");
		} else {
			a = Math.toRadians(a);
			a = Math.round(Math.cos(a) / Math.sin(a));
			System.out.println("cot: " + a);
		}
	}

}
