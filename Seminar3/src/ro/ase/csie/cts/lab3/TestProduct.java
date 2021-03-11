package ro.ase.csie.cts.lab3;

import ro.ase.csie.cts.lab3.exception.InvalidAccountAgeException;
import ro.ase.csie.cts.lab3.exception.InvalidPriceException;
import ro.ase.csie.cts.lab3.stage1.Product;
import ro.ase.csie.cts.lab3.stage1.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		try {
			product.getFinalPrice(ProductType.NEW, 0, 0);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
