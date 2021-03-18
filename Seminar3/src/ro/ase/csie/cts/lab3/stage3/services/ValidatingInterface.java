package ro.ase.csie.cts.lab3.stage3.services;

import ro.ase.csie.cts.lab3.exception.InvalidAccountAgeException;
import ro.ase.csie.cts.lab3.exception.InvalidPriceException;

public interface ValidatingInterface {
	
	public static void validatePrice(float price) throws InvalidPriceException;
	public static void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException 
}
