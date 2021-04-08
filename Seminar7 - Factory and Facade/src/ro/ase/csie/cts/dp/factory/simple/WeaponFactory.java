package ro.ase.csie.cts.dp.factory.simple;

import java.nio.channels.UnsupportedAddressTypeException;

public class WeaponFactory {
	public static AbstractWeapon getWapon(WeaponType type, String color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(color, 100);
			break;
		case MACHINEGUN:
			weapon = new MachineGun(color);
			break;
		case BAZOOKA:
			weapon = new Bazooka(color, 1000, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}
}
