package ro.ase.csie.cts.lab3.stage2;

public enum ProductType {
	
	NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float discount;
	
	private ProductType(float discount) {
		this.discount = discount;
	}
	
//	private ProductType() {
//		this.discount = 0;
//	}
	// we can declare this constructor above
	
	public float getDiscount() {
		return this.discount;
	}
}
