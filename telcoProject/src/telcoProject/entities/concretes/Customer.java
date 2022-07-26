package telcoProject.entities.concretes;

import java.util.List;

public class Customer {
	private int id;
	private String musteriNo;
	List<Subscription> subscriptions;
	List<Address> addresses;
	
	
	


	public Customer() {
	}
	
	
	
	public Customer(int id, String musteriNo, List<Subscription> subscriptions,List<Address> addresses) {
		this.id = id;
		this.musteriNo = musteriNo;
		this.subscriptions = subscriptions;
		this.addresses= addresses;
		
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMusteriNo() {
		return musteriNo;
	}
	public void setMusteriNo(String musteriNo) {
		this.musteriNo = musteriNo;
	}
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	
	
}
