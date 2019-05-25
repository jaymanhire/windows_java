
public class PerformanceStage {

	private static PerformanceStage INSTANCE = null;
	private static int counter = 0;
	// private constructor for Singleton
	public PerformanceStage() {
		counter++;
	}

	public synchronized static PerformanceStage getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}

	public void turnOnLights() {
		System.out.println("Turn on lights...");
	}
	
	public int getCounter() {
		return counter;
	}

}
