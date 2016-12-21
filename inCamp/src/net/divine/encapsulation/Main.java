package net.divine.encapsulation;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Mike", "Posner");
		Client client2 = new Client("Luke", "Skywaker");
		Bank bankInLviv = new Bank("Alpha");
		Bank bankInKyiv = new Bank("CreditBank");
		bankInLviv.createAccount(client);
		bankInLviv.addCash(client, 100);
		bankInLviv.addCash(client, 100);
		bankInKyiv.createAccount(client);
		bankInLviv.removeCash(client, 101);
		bankInLviv.checkCash(client);
		bankInLviv.checkCash(client2);
	}

}
