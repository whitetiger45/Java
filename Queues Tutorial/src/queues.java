import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class queues {
	public static void main(String[] args) {
	Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);//array blocking queue can control the size
	
	q1.add(10);
	q1.add(20);
	q1.add(30);
	try{
		q1.add(10);//last item can't be added
	}catch(IllegalStateException e){
		System.out.println("Tried to add too many items to the queue.");
	}
	
	for(Integer value : q1)
		System.out.println("Queue value: " + value);
	
	//removes the head of the queue...fifo
	
	System.out.println("Removed from queue: " + q1.remove());
	System.out.println("Removed from queue: " + q1.remove());
	System.out.println("Removed from queue: " + q1.remove());
	
	try{
		System.out.println("Removed from queue: " + q1.remove());
	}catch(NoSuchElementException e){
		System.out.println("Tried to remove too many elements!");
	}
	
	
Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);//array blocking queue can control the size
	
	System.out.println("Queue 2 peek: " + q2.peek());
	q2.offer(10);
	System.out.println("Queue 2 peek: " + q2.peek());
	q2.offer(20);
	System.out.println("Queue 2 peek: " + q2.peek());
	if(q2.offer(30) == false){
		System.out.println("Offer failed to add third item");
	}
	
	System.out.println("Queue 2 poll: "+ q2.poll());
	System.out.println("Queue 2 poll: "+ q2.poll());
	System.out.println("Queue 2 poll: "+ q2.poll());
	
	}
}
