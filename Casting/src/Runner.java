import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Square sq1 = new Square();
		Circle c1 = new Circle();

		sq1.setArea(10);
		System.out.println(sq1);

		c1.radius = 765;

		c1.setArea(100);
		System.out.println(c1);

		ArrayList<Shape> shapeList = new ArrayList<Shape>();

		shapeList.add(sq1);
		shapeList.add(c1);

		// why? if (s instanceof Circle) {
		System.out.println(shapeList);

		for (Shape s : shapeList) {

			System.out.println(s.getArea());

//			System.out.println(((Circle) s).radius + s.getArea());

			// upcasting is safe - a Circle can do everything a shape can do
			// however downcasting is unsafe - a shape cannot do everything a circle can do
			// therefore we need to explicity cast
			// and we must be safe when we do it.

		}

	}

}
