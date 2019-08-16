
public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queArray;
	private int front; // index pos for the element in front
	private int rear; // index pos for the element at the rear
	private int nItems;

	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size]; // initialize the size of the array
		front = 0; // index pos for the element in front
		rear = -1; // there is no item in the array yet to be considered the last item.
		nItems = 0; // no elements yet

	}

	// Insert items at the end of the queue
	public void insert(long j) {
		if (rear == maxSize - 1) { // "Circular Queue" -- Overwrites
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}

	public long remove() { // items are removed from the front
		long temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // set front back to oth index so we can utilize the entire array again
		}
		nItems--;
		return temp;

	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public long isFull() {
		return (nItems = maxSize);
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
	}

}
