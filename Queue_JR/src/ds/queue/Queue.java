package ds.queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queueArray; // slots to maintain the data
	private int front; // index pos in the front
	private int rear;
	private int nItems; // counter to maintain number of items

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; // index position of the first slot in the array
		rear = -1; // there is no item in the array yet to be considered the last item.
		nItems = 0; // We do not have items in te array yet

	}

	public void insert(long j) {
		if (rear == maxSize - 1) {
			System.out.println("Reached the end of the queue...");
			rear = -1;
		}
		rear++;
		queueArray[rear] = j;
		nItems++;
	}

	public long remove() { // remove item from the front
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // set front back to the 0th index so we can utilize the entire array again.
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println("]");
	}

}
