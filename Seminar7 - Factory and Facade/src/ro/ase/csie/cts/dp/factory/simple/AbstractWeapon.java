package ro.ase.csie.cts.dp.factory.simple;

public abstract class AbstractWeapon {

	String color;
	int power;
	
	protected AbstractWeapon(String color, int power) {
		this.color = color;
		this.power = power;
	}

	public abstract void pewPew();
	
	
}
