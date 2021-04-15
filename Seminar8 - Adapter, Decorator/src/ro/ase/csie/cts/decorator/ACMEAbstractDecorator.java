package ro.ase.csie.cts.decorator;

import ro.ase.csie.cts.adapter.ACMECharacter;

public class ACMEAbstractDecorator extends ACMECharacter {

	protected ACMEAbstractDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifePoints());
		this.character = hero;
	}

	ACMECharacter character = null;

	@Override
	public void move() {
		this.character.move();
		
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
		
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
		
	}
	
	
	
}
