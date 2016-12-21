package net.divine.inheritance;

public class CaptainAmerica extends SuperHero {
	private String ability;
	private int intelligence;
	private int patriotism;

	public CaptainAmerica(String name, String suit, String ability, int inteligence, int patriotism) {
		super(name, suit);
		this.ability = ability;
		this.intelligence = inteligence;
		this.patriotism = patriotism;
	}

	@Override
	public void usePower() {
		System.out.println(getName() + " can " + ability + " on " + getSuit()
				+ " suit. Beside I love my country a " + patriotism + "% percent and my IQ is "+intelligence);
	}

	public void beCaptain() {
		System.out.println("We must defend our country");
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getPatriotism() {
		return patriotism;
	}

	public void setPatriotism(int patriotism) {
		this.patriotism = patriotism;
	}

}
