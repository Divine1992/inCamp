package net.divine.inheritance;

public class Main {

	public static void main(String[] args) {
		CaptainAmerica captainAmerica = new CaptainAmerica("Bobby", "silk", "punch enemy", 50 , 1000);
		captainAmerica.adversting();
		captainAmerica.usePower();
		captainAmerica.beCaptain();
		IronMan ironMan = new IronMan("Tony", "iron", true, 20, "tell jokes");
		ironMan.usePower();
		ironMan.beIronMan();
	}

}
