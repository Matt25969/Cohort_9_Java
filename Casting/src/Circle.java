
public class Circle extends Shape {

	// notice how this is public
	public double radius;

	@Override
	public void setArea(double area) {

		super.setArea(area);
		this.radius = Math.sqrt(area / Math.PI);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", and it is a Circle";
	}

}
