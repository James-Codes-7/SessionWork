package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDetails {

	public static void main(String[] args) {
	
		//queue is interface    linklist implement deque-> deque extends linked list
		Queue<Integer> queue =new  LinkedList<>();
		
		//it add the element to the queue if queue is full it don't throw exception
		queue.offer(8);//it return boolean
		queue.offer(3);
		queue.offer(6);
		 
		//it add the element the queue if queue fill it throw exception
		queue.add(7);//it return boolean
		System.out.println(queue);
		
		//it return the first element and remove it
		System.out.println(queue.poll());
		System.out.println(queue);
		
		//it remove the element and return that element else throw exception
		System.out.println(queue.remove());
		System.out.println(queue);
		
		//it return the first element don't delete;
		System.out.println(queue.peek());
		
		

	}

}
