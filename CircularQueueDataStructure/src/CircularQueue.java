
public class CircularQueue {

	int arr[] = null;
	int capacity = 4;
	int front = 0;
	int rear = -1;
	int size = 0;
	public CircularQueue() {
		this.arr = new int[capacity];
	}
	public CircularQueue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	public void enqueue(int data) {
		if(size==capacity) {
			System.out.println("Queue is full");
			return;
		}
		
		//This logic help us to after deleting data if queue is full it will help to again insert value
		/*if(rear==capacity) {
			rear=0;
		}*/
		//another way of insertion value if queue is full after deleting data to insert value using % operator
		//This logic is called as circular queue logic
		rear = (rear+1)%capacity;
		arr[rear] = data;
		size++;
		System.out.println(data+"is inserted data");
		System.out.println("inserted position is"+rear);
	}
	public void dq() {
		if(size==0) {
			System.out.println("Quee is empty");
			return;
		}
		int data = arr[front];
		//Circular queue logic
		front = (front+1)%capacity;
		size--;
		System.out.println(data+"is removed data");
		System.out.println("the removed data position is"+front);
		
	}
	public boolean isFull() {
		return size == capacity;
	}
	public boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue q = new CircularQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dq();
		q.enqueue(50);
		System.out.println("The queue is full"+q.isFull());
		q.dq();
		q.dq();
		q.dq();
		q.dq();
		System.out.println("The queu is Empty"+q.isEmpty());
		

	}

}



