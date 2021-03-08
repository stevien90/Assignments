package Day4;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.lang.model.element.Element;

public class QueueAssignment {

	public static void main(String[] args) {
		/* Queue<E>(I)
		 * - Designed for holding elements prior to processing. Queues provide additional feature
		 * such as insertion (insert), extraction (remove), and inspection (Examine) operations.
		 * 
		 * - Each of these operations will have 2 results: 
		 *   1) throws an exception if the operations fails
		 *   2) returns a special value (either null or false, depending on operation).
		 * 
		 * - Methods
		 *  - insert or offer: inserts and element if possible, otherwise returning false
		 *  - remove or poll: remove and return the head of the queue. Remove will throw an
		 *  exception if the queue is empty and poll will return null
		 *  - element or peek: returns the head of the queue
		 * 
		 * - Queues do not allow null, only linkedlist allows nulls. 
		 *
		 * Priority Queues 
		 * - is the only one thats orders in a first-in-first-out manner.
		 * - all new elements are added to the end of the tail so you can't 
		 * update position or insert in a certain position
		 * - cannot contain null
		 * 
		 */
		
		//Creating CRUD using PriortiyQueue
		Queue<Integer> pq = new PriorityQueue<>();
		
		//create
		pq.add(0);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.offer(6);
		
		//read
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq.contains(1));
		//System.out.println(pq.getClass(3));
		
		//no update methods I am aware of
		
		//Delete
		pq.remove(5);// you can choose your position to delete?
		pq.poll();// only removes the head of the queue
		System.out.println(pq); //not sure why it is unordered

	}

}
