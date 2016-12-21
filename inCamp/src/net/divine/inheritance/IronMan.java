package net.divine.inheritance;

public class IronMan extends SuperHero {
	private Boolean isCanFly;
	private int strenght;
	private String teamSkill;

	public IronMan(String name, String suit, Boolean isCanFly, int strenght, String teamSkill) {
		super(name, suit);
		this.isCanFly = isCanFly;
		this.strenght = strenght;
		this.teamSkill = teamSkill;
	}

	@Override
	void usePower() {
		System.out.println(getName() + " can fly and this is " + isCanFly + " with " + strenght
				+ " strenght and add to our team " + teamSkill + " on " + getSuit() + " suit ");
	}

	public void beIronMan() {
		System.out.println("I have cool home");
	}

	public Boolean getIsCanFly() {
		return isCanFly;
	}

	public void setIsCanFly(Boolean isCanFly) {
		this.isCanFly = isCanFly;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public String getTeamSkill() {
		return teamSkill;
	}

	public void setTeamSkill(String teamSkill) {
		this.teamSkill = teamSkill;
	}

}
