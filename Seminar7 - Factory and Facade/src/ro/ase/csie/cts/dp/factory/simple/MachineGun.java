package ro.ase.csie.cts.dp.factory.simple;

public class MachineGun extends AbstractWeapon{

	protected MachineGun(String color) {
		super(color, 500);
	}

	@Override
	public void pewPew() {
		System.out.println("--> --> -->");
		
	}

	
}
