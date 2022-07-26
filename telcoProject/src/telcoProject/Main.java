package telcoProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import telcoProject.entities.concretes.Address;
import telcoProject.entities.concretes.AddressType;
import telcoProject.entities.concretes.AdslProduct;
import telcoProject.entities.concretes.Canal;
import telcoProject.entities.concretes.CorporateCustomer;
import telcoProject.entities.concretes.Customer;
import telcoProject.entities.concretes.IndividualCustomer;
import telcoProject.entities.concretes.Invoice;
import telcoProject.entities.concretes.Packages;
import telcoProject.entities.concretes.Payment;
import telcoProject.entities.concretes.Product;
import telcoProject.entities.concretes.Service;
import telcoProject.entities.concretes.Subscription;
import telcoProject.entities.concretes.SubscriptionPackage;
import telcoProject.entities.concretes.TivibuProduct;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		List<Address> addresses= new ArrayList<Address>();
		List<Subscription> subscriptions = new ArrayList<Subscription>();
		List<SubscriptionPackage> subscriptionPackages = new ArrayList<SubscriptionPackage>();
		List<Payment> payments = new ArrayList<Payment>();
		List<Invoice> invoices = new ArrayList<Invoice>();
		
		Service service1= new Service(1,"adsl",products,subscriptions);
		Service service2= new Service(2,"fiber",products,subscriptions);
		AdslProduct adslProduct1 = new AdslProduct(11,5,3,"ASUS","Bakýr","1124568",512,service1);
		Product tivibuProduct = new TivibuProduct(21,"tivibu","25748","fiber",5,2,4,service2);
		products.add(tivibuProduct);
		products.add(adslProduct1);
		CorporateCustomer corporateCustomer = new CorporateCustomer(201,"etiya",152,"25489",subscriptions,addresses);
		Customer ÝndividualCustomer = new IndividualCustomer(101,"Merve","Demiraslan","458694","1235",subscriptions,addresses);
		Subscription subscription1 = new Subscription(22,LocalDate.parse("2002-07-26"), ÝndividualCustomer,service2,invoices,subscriptionPackages);
		Subscription subscription2 = new Subscription(22,LocalDate.parse("2002-07-26"), corporateCustomer,service1,invoices,subscriptionPackages);
		subscriptions.add(subscription1);
		subscriptions.add(subscription2);
		Packages firstPackage = new Packages(5, "Internet", 90, LocalDate.parse("2022-07-07"), LocalDate.parse("2022-07-26"), 19, subscriptionPackages);
		SubscriptionPackage subscriptionPackage = new SubscriptionPackage(111,subscription1,firstPackage);
		subscriptionPackages.add(subscriptionPackage);
		AddressType addressType = new AddressType(1, "Ev", addresses);
		Address address1 = new Address(01, "Yenimahalle", addressType, ÝndividualCustomer);
		addresses.add(address1);
		Invoice invoice1 = new Invoice(7,LocalDate.parse("2022-06-26"),LocalDate.parse("2022-08-08"), subscription1,payments);
		invoices.add(invoice1);
		Canal canal1 = new Canal(1,"banka-otomatik ödeme",payments);
		Canal canal2= new Canal(2, "kredi kartý", payments);
		Payment payment1 = new Payment(44,LocalDate.parse("2022-05-05"),canal1,invoice1);
		payments.add(payment1);
		
		
		
		System.out.println("Müþteri: "+((IndividualCustomer) ÝndividualCustomer).getFirstName()+" "+((IndividualCustomer) ÝndividualCustomer).getLastName()+
				"\nAdres tipi: "+((IndividualCustomer) ÝndividualCustomer).getAddresses().get(0).getAddressType().getName()+"\nAbonelik Baþlama Tarihi: "
				+((IndividualCustomer) ÝndividualCustomer).getSubscriptions().get(0).getDateStarted()+" , ürün:  "+
				tivibuProduct.getBrand()+", hizmet türü:  "+tivibuProduct.getService().getName()+
				"\nAdress: "+subscription1.getCustomer().getAddresses().get(0).getDetail() +
				" /ödeme tipi: "+subscription1.getInvoices().get(0).getPayments().get(0).getCanal().getName()+
				" / fatura son ödeme tarihi: "+payment1.getInvoice().getDueDate());
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Müþteri: "+corporateCustomer.getCompanyName()+"    /  Hizmet: "+corporateCustomer.getSubscriptions().get(1).getService().getName()+
				"\nPaket içeriði: "+ canal1.getPayments().get(0).getInvoice().getSubscription().getSubscriptionPackages().get(0).getPackageId().getName()+
				" / alýnan ürün markasý: " +corporateCustomer.getSubscriptions().get(0).getService().getProducts().get(0).getBrand()
		+" / id: "+ subscriptionPackage.getSubscription().getCustomer().getId());
	}

}
