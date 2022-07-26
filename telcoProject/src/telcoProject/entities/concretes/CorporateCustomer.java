package telcoProject.entities.concretes;

import java.util.List;

public class CorporateCustomer extends Customer{
	private String companyName;
	private int taxNumber;
	
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(int id,String companyName, int taxNumber, String musteriNo, List<Subscription> subscriptions,List<Address> addresses) {
		super(id,  musteriNo,  subscriptions, addresses);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
}
