package vehicles;
import parts.Engine;

public class Vehicle {
	
	Engine myEngine;
	/*Tire tires;
	Windshield shield;
	Roof roof;*/
	
	public Vehicle(Engine anEngine) {
		myEngine = anEngine;
	} 
	//Engine racingEngine = new LargeEngine(500);
	
	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running...");
	}

}
