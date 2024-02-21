package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manuFactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, Date manuFactuereDate) {
		super(name, price);
		this.manuFactureDate = manuFactuereDate;
	}

	public Date getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}

	@Override
	public String priceTag() {
		
		return "(Used) $ " + super.getPrice() + "(Manufacture date: " + manuFactureDate + ")";
	}

}
