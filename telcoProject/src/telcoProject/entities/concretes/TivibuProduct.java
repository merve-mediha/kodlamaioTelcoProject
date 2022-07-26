package telcoProject.entities.concretes;

public class TivibuProduct extends Product{
	private int usbPort;
	private int speed;
	
	
	
	
	
	public TivibuProduct() {
		super();
	}





	public TivibuProduct(int id, String brand, String serialNumber, String cableType, int cableLength,int usbPort, int speed, Service service) {
		super(id, brand, serialNumber, cableType, cableLength, service);
		this.usbPort = usbPort;
		this.speed = speed;
		
	}





	public int getUsbPort() {
		return usbPort;
	}





	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}





	public int getSpeed() {
		return speed;
	}





	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	

}
