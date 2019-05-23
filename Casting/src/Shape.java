
public abstract class Shape {

	private double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The area of this shape is " + area;
	}

}
