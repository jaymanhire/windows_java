
public class Application {

	public static void main(String[] args) {
		
		Triangle myTriangle = new Triangle();
		Drawing drawing = new Drawing();
		drawing.setShape(myTriangle);
		drawing.drawShape();
		
		Circle myCircle = new Circle();
		drawing.setShape(myCircle);
		drawing.drawShape();
		
		

		/*Shape shape = new Triangle();
		myDrawMethod(shape);*/

		/*
		 * Triangle myTriangle = new Triangle(); myTriangle.draw();
		 * 
		 * Circle myCircle = new Circle(); myCircle.draw();
		 */

		/*
		 * Shape shape = new Triangle(); shape.draw();
		 * 
		 * Shape shape2 = new Circle(); shape2.draw();
		 */
	}

	public static void myDrawMethod(Shape shape) {
		shape.draw();

	}

}
