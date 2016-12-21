package net.divine.polymorphism;

public class Main {

	public static void main(String[] args) {
		Calculator cosCalculator = new CosCalculator();
		Calculator sinCalculator = new SinCalculator();
		Calculator cotCalculator = new CotCalculator();
		Calculator tanCalculator = new TanCalculator();
		Calculator[] arrCalc = new Calculator[4];
		arrCalc[0] = cosCalculator;
		arrCalc[1] = sinCalculator;
		arrCalc[2] = cotCalculator;
		arrCalc[3] = tanCalculator;
		for (int i = 0; i < arrCalc.length; i++) {
			arrCalc[i].angle(90);
		}
	}
	
}
