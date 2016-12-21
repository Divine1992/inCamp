package net.divine.encapsulation;

public class Bank {
	private String name;
	private Client client;
	private int money;

	public Bank() {

	}

	public Bank(String nameBank) {
		this.name = nameBank;

	}

	public void checkCash(Client client) {
		if (this.client != client) {
			System.out
					.println(client.getName() + " " + client.getSurname() + " doesn't sign " + this.name);
		} else {
			System.out.println("User: " + client.getName() + " " + client.getSurname()
					+ " has cash on his account: " + this.money + " $");
		}
	}

	public void removeCash(Client client, int money) {
		this.client = client;
		if (this.money < money) {
			System.out.println("Sorry " + client.getName() + " " + client.getSurname()
					+ " you hasn't money on your account for this operation");
		} else {
			this.money -= money;
			System.out
					.println("User: " + client.getName() + " " + client.getSurname() + " whithdraw money from his account: "
							+ money + " $, account balance " + this.money + " in the bank: " + this.name);
		}
	}

	public void createAccount(Client client) {
		this.client = client;
		System.out.println("User: " + client.getName() + " " + client.getSurname() + " sign in the bank: "
				+ this.name);
	}

	public void addCash(Client client, int money) {
		this.client = client;
		this.money += money;
		System.out.println("User: " + client.getName() + " " + client.getSurname() + " replenished account: "
				+ money + " $, in the bank: " + this.name);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
