package telcoProject.entities.concretes;

public class SubscriptionPackage {
	private int id;
	private Subscription subscription;
	private Packages packageId;
	
	
	public SubscriptionPackage() {
	}


	public SubscriptionPackage(int id, Subscription subscription, Packages packageId) {
		this.id = id;
		this.subscription = subscription;
		this.packageId = packageId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Subscription getSubscription() {
		return subscription;
	}


	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}


	public Packages getPackageId() {
		return packageId;
	}


	public void setPackageId(Packages packageId) {
		this.packageId = packageId;
	}
	
	
	
	
}
