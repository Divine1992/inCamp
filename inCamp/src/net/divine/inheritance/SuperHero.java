package net.divine.inheritance;

public abstract class SuperHero {
	private String name;
	private String suit;

	public SuperHero(String name, String suit) {
		this.name = name;
		this.suit = suit;
	}

	abstract void usePower();

	public void adversting() {
		System.out.println("I am the best of the best!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

}
