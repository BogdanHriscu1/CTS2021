package ro.ase.acs.cts.dp.builder;

public class SuperHero {

	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;
	
	private WeaponInterface rightWeapon;
	private WeaponInterface leftWeapon;
	
	SuperPowerInterface superPower;
	SuperPowerInterface superSuperPower;
	
	public SuperHero() {
		
	}

	SuperHero(String name, 
			int lifePoints, 
			boolean isVillain, 
			boolean isWounded, 
			WeaponInterface rightWeapon,
			WeaponInterface leftWeapon, 
			SuperPowerInterface superPower, 
			SuperPowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	
}
