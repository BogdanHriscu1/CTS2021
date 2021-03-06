package ro.ase.csie.cts.dp.factory.method;

import com.sun.pisces.PiscesRenderer;

import ro.ase.csie.cts.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.dp.factory.simple.Pistol;
import ro.ase.csie.cts.dp.factory.simple.WeaponType;

public class TestFactoryMethod {

	public static void main(String[] args) {
		boolean isWaterModeSet = true;

//		if(isWaterModeSet) {
//			//code the game using water based weapons
//			AbstractWeapon pistol = new WaterPistol("Grey", 200);
//		}
//		else {
//			AbstractWeapon pistol = new Pistol("grey", 200);
//		}
		
		
		AbstractWeaponFactory theFactory = null;
		theFactory = (isWaterModeSet) ? new KidsModeFactory() : new RealModeFactory();
		
		//generic game coding
		AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");
		
		
	}

}
