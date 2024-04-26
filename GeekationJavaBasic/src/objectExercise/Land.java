package objectExercise;

public class Land extends Property {
	private double area; //広さ
	
	public Land(String name, String owner, int price, double area) {
		super(name, owner, price);
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
}