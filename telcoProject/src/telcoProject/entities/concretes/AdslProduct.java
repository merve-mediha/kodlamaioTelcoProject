package telcoProject.entities.concretes;

public class AdslProduct extends Product{
	
	private int bandWidth;
	private int speedCapability;
	
	
	
	
	public AdslProduct() {
		super();
	}


	public AdslProduct(int id,int bandWidth, int speedCapability,  String brand, String serialNumber, String cableType, int cableLength, Service service) {
		super(id, brand, serialNumber, cableType, cableLength, service);
		this.bandWidth = bandWidth;
		this.speedCapability = speedCapability;
	
	}


	public int getBandWidth() {
		return bandWidth;
	}


	public void setBandWidth(int bandWidth) {
		this.bandWidth = bandWidth;
	}


	public int getSpeedCapability() {
		return speedCapability;
	}


	public void setSpeedCapability(int speedCapability) {
		this.speedCapability = speedCapability;
	}
	
	
	
	
	
	
}
