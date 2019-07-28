package multithreading_runnable_interface;

public class Main {

	public static void main(String[] args) {

		System.out.println(Thread.activeCount());

		Thread thread1 = new Thread(new RunnableExample());
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 1;
				while (i <= 100) {
					System.out.println(i + " " + Thread.currentThread().getName());
					i++;
				}
			}
		});
		thread2.start();

	}

}
