package liskov_substitution_principle.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// List of buildings
		List<Building> buildings = new ArrayList<Building>();
		buildings.add(new Building());
		buildings.add(new Building());
		printBuildings(buildings);

		// List of offices
		List<Office> offices = new ArrayList<Office>();
		offices.add(new Office());
		offices.add(new Office());
		printBuildings(offices);

		// List of Houses
		List<House> houses = new ArrayList<House>();
		houses.add(new House());
		houses.add(new House());
		printBuildings(houses);
		
		addHouseToList(buildings);

	}

	private static void printBuildings(List<? extends Building> buildings) {
		for (int i = 0; i < buildings.size(); i++) {
			System.out.println(buildings.get(i));
		}
		System.out.println();
	}

	private static void addHouseToList(List<? super House> buildings) { // Can now pass in buildings, because Building
																		// is a super type of house
		buildings.add(new House());
		System.out.println();
	}

}
