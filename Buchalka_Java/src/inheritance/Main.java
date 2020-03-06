package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Outlander outlander = new Outlander(12);
		outlander.steer(45);
		outlander.accelerate(30);	
		outlander.accelerate(35);
		
		outlander.changeGear(5);
		
		outlander.accelerate(-50);
		outlander.accelerate(-25);
	
	}
}
