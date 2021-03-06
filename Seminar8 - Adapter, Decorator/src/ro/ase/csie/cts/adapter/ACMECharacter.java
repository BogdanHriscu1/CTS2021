package ro.ase.csie.cts.adapter;

public abstract class ACMECharacter {

	protected String name;
	protected int lifePoints;
	
	protected ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public String getName() {
		return name;
	}

	public abstract void move();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
	
	
}
