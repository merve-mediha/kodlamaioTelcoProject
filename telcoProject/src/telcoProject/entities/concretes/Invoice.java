package telcoProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
	private int id;
	private LocalDate dateCreated;
	private LocalDate dueDate;
	private Subscription subscription;
	
	List<Payment> payments;
	
	public Invoice() {
	}


	public Invoice(int id, LocalDate dateCreated, LocalDate dueDate, Subscription subscription,List<Payment> payments) {
		this.id = id;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
		this.subscription = subscription;
		this.payments= payments;
	}


	public int getId() {
		return id;
	}


	public List<Payment> getPayments() {
		return payments;
	}


	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueCreated) {
		this.dueDate = dueCreated;
	}


	public Subscription getSubscription() {
		return subscription;
	}


	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	
	

}
