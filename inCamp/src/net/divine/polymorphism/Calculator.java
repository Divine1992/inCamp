package net.divine.polymorphism;

public abstract class Calculator {

	abstract void angle(double a);

	public void Sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void Neg(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	public void Div(int a, int b) {
		int c = a / b;
		System.out.println(c);
	}

	public void Inc(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}
}
