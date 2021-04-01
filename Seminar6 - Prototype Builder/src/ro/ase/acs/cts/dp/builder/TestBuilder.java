package ro.ase.acs.cts.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
//		SuperHero superHero = new SuperHero();
//		SuperHero superHero2 = new SuperHero("Superman", 100, false, false, new Weapon(), 
//				null, new Flying(), null);	

		SuperHero superman = 
				new SuperHero.SuperHeroBuilder("Superman", 100).build();
		
		SuperHero joker =
				new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.isWounded()
				.setRightWeapon(new Weapon())
				.build();
	}

}
