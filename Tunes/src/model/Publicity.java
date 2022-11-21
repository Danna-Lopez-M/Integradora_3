package model;

public enum Publicity implements Playable{
	COCACOLA("CocaCola","Open Happiness"),
	MYM("M&M","Melts in Your Mouth, Not in Your Hands"),
	NIKE("Nike","Just Do It");
	
	private String brand;
	private String slogan;
	
	Publicity (String brand, String slogan){
		this.brand = brand;
		this.slogan = slogan;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	public String reproduce() {
		String msg = "";
		
		msg = "Hosted by: ";
		
		return msg;
	}

}
