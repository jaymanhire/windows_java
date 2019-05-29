package ds.queue;

public class App {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(25);
		myQueue.insert(35);
		myQueue.insert(45);
		myQueue.insert(1);
		
		
		myQueue.view();
		
		

	}

}
