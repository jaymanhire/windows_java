
public class Application {
	public static void main(String[] args) {

		PerformanceStage stage = PerformanceStage.getInstance();	
		
		
		PerformanceStage stage2 = new PerformanceStage();
		PerformanceStage stage3 = new PerformanceStage();
		PerformanceStage stage4 = new PerformanceStage();
		PerformanceStage stage5 = new PerformanceStage();
		
		System.out.println(stage5.getCounter());


		/*
		 * stage.turnOnLights(); System.out.println(stage.getCounter());
		 * 
		 * PerformanceStage stage2 = PerformanceStage.getInstance();
		 * System.out.println(stage2.getCounter());
		 */

	}

	
}
