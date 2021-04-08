package ro.ase.csie.cts.dp.factory.simple;

public class Pistol extends AbstractWeapon {

	
	
	protected Pistol(String color, int power) {
		super(color, power);
		
	}

	@Override
	public void pewPew() {
		System.out.println();
	}

	
}
