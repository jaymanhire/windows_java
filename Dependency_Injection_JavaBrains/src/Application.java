
public class Application {

	public static void main(String[] args) {
		
		Triangle myTriangle = new Triangle();
		Drawing drawing = new Drawing();
		drawing.setShape(myTriangle);
		drawing.drawShape();
		
		Circle myCircle = new Circle();
		drawing.setShape(myCircle);
		drawing.drawShape();		

	}

	public static void myDrawMethod(Shape shape) {
		shape.draw();

	}

}
