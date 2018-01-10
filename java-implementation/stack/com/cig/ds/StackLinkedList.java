package com.cig.ds;

import java.util.LinkedList;
import java.util.ListIterator;

/**
* StackLinkedList
*
* The StackLinkedList class implements a stack data structure
* using a linked list
*
* @author  Nithin Biliya
* @version 1.0
* @since   04/01/2018
*/

public class StackLinkedList<T> {
	private LinkedList<T> ll;

	/**
	* Constructor to initialize an empty linked list
	*/
	public StackLinkedList() {
		ll=new LinkedList<T>();
	}

	/** 
	* performs push operation on the stack
	* @param value this is the value pushed onto the top of the stack
	*/	
	public void push(T value) {
		ll.addFirst(value);
	}
	
	/** 
	* performs pop operation on the stack
	* @return T this is the value popped from the top of the stack
	*/	
	public T pop() {
		return ll.removeFirst();
	}
	
	/** 
	* performs peek operation on the stack
	* @return T this returns the element that is there on the top of the stack
	*/	
	public T peek() {
		return ll.getFirst();
	}
	
	/** 
	* size of the stack
	* @return int returns the size of the stack
	*/	
	public int count() {
		return ll.size();
	}
	
	/** 
	* clears the stack
	*/	
	public void clear() {
		ll.clear();
	}
	
	/** 
	* displays the size, top element and all the elements of the stack
	*/	
	public void display() {
		if(count()>0) {
			ListIterator li=ll.listIterator(0);
			System.out.println("Size - "+count()+"  Top - "+peek());
			System.out.println("Stack elements - ");
			while(li.hasNext()) {
				System.out.println(li.next()+"  ");
			}
		} else {
			System.out.println("stack is empty!");
		}
	}
}
