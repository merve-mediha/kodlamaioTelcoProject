package telcoProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Subscription {
	private int id;
	private LocalDate dateStarted;
	private Customer customer;
	private Service service;
	List<Invoice> invoices;
	List<SubscriptionPackage> subscriptionPackages;
	
	
	
	
	public Subscription() {
	}
	
	
	
	public Subscription(int id, LocalDate dateStarted, Customer customer, Service service, List<Invoice> invoices,List<SubscriptionPackage> subscriptionPackages) {
		this.id = id;
		this.dateStarted = dateStarted;
		this.customer = customer;
		this.service = service;
		this.invoices = invoices;
		this.subscriptionPackages= subscriptionPackages;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	public List<SubscriptionPackage> getSubscriptionPackages() {
		return subscriptionPackages;
	}



	public void setSubscriptionPackages(List<SubscriptionPackage> subscriptionPackages) {
		this.subscriptionPackages = subscriptionPackages;
	}


	
}
