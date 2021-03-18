package ro.ase.csie.cts.lab3.stage2;

import ro.ase.csie.cts.lab3.exception.InvalidAccountAgeException;
import ro.ase.csie.cts.lab3.exception.InvalidPriceException;
import ro.ase.csie.cts.lab3.stage3.MarketingInterface;
import ro.ase.csie.cts.lab3.stage3.ValidatingInterface;

public class Product {
	
	MarketingInterface mkService = null;
	ValidatingInterface validatorService = null;	
	
	public static float getPriceWithDiscount(float initialPrice, float discountValue) {
		
		return initialPrice - discountValue*initialPrice;
	}
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException {
		
		validatorService.validatePrice(initialPrice);
		validatorService.validateAccountAge(accountAgeInYears);
		
		float fidelityDiscount = (productType == ProductType.NEW)?0:mkService(accountAgeInYears);
		
		float discountValue = productType.getDiscount();
		float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
		
		float finalPrice = priceWithDiscount*(1-fidelityDiscount);
		return finalPrice;
	}
}