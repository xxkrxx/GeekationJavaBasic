package objectExercise;

public class Apartment extends Property {
	private String layout;
	
	public Apartment(String name, String owner,int price, String layout) {
		super(name, owner, price);
		this.layout = layout;
	}
	
	public String getLayout() {
		return layout;
	}
	
	public void setlayout(String layout) {
		this.layout = layout;
	}
}







