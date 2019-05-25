import java.awt.Color;
import java.awt.Dimension;

public class Architect {

	public static void main(String[] args) {

		// Bedroom bedroom = new Bedroom(new Dimension(20,35), 20, 2, Color.cyan, 12, 3,
		// true, false);

		Bedroom room = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3).setFloorNumber(2)
				.setWallColor(Color.BLUE).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true)
				.setHasEnsuite(false).createBedroom();
		
		System.out.println(room.toString());

	}

}
