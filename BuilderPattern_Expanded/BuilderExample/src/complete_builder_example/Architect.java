
package complete_builder_example;

import java.awt.Color;
import java.awt.Dimension;
 
public class Architect {
    
    public static void main(String[] args) {
    	
        Bedroom bedRoom1 = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3).setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(false).createBedroom();
        Bedroom bedRoom2 = new BedroomBuilder().setDimensions(new Dimension(300, 250)).createBedroom();
        Kitchen kitchen = new KitchenBuilder().setCeilingHeight(13).setFloorNumber(1).setDimensions(new Dimension(20, 35)).createKitchen();

		System.out.println(bedRoom1.toString());
		System.out.println();
		System.out.println(bedRoom2.toString());
		System.out.println();
		System.out.println(kitchen.toString());

	}

}
