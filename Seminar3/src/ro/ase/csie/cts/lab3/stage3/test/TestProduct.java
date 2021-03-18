package ro.ase.csie.cts.lab3.stage3.test;

import ro.ase.csie.cts.lab3.exception.InvalidAccountAgeException;
import ro.ase.csie.cts.lab3.exception.InvalidPriceException;
import ro.ase.csie.cts.lab3.stage3.Product;
import ro.ase.csie.cts.lab3.stage3.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		
		Product product  = new Product();
		float finalPrice = 0;
		try {
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The final price is: " + finalPrice);

	}

}
