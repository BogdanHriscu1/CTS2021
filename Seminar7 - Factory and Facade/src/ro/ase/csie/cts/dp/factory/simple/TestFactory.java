package ro.ase.csie.cts.dp.factory.simple;

public class TestFactory {

	public static void main(String[] args) {
		
//		AbstractWeapon pistol = new Pistol("black", 100);
//		AbstractWeapon machineGun = new MachineGun("red");
//		AbstractWeapon bazooka = new Bazooka("green", 100, 500);
		
		AbstractWeapon weapon = WeaponFactory.getWapon(WeaponType.PISTOL, "black");
		weapon = WeaponFactory.getWapon(WeaponType.MACHINEGUN, "red");
		weapon = WeaponFactory.getWapon(WeaponType.BAZOOKA, "green");
	}

}
