package com.cig.ds;

import java.util.LinkedList;
import java.util.ListIterator;

/**
* QueueArray
*
* The QueueArray class implements a queue data structure
* using an array
*
* @author  Nithin Biliya
* @version 1.0
* @since   07/02/2018
*/

public class QueueArray {
	private int[] arr;
	private int minSize,head;

	/**
	* Constructor to initialize the array and head variables
	*/
	public QueueArray() {
		minSize=2;
		arr=new int[minSize];
		head=-1;
	}

	/** 
	* performs push operation on the queue
	* @param value this is the value pushed onto the tail of the queue
	*/
	public void push(int value) {
		if(head==arr.length-1) {
			int[] tmp=arr;
			arr=new int[tmp.length*2];
			System.arraycopy(tmp,0,arr,0,tmp.length);
		}
		arr[++head]=value;
	}
	
	/** 
	* performs pop operation on the queue
	* @return int this is the value popped from the head of the queue
	*/	
	public int pop() {
		return arr[head--];
	}
	
	/** 
	* performs peek operation on the queue
	* @return int this returns the element that is there on the head of the queue
	*/	
	public int peek() {
		return arr[head];
	}
	
	/** 
	* size of the queue
	* @return int returns the size of the queue
	*/	
	public int count() {
		return head+1;
	}
	
	/** 
	* clears the queue
	*/	
	public void clear() {
		head=-1;
	}
	
	/** 
	* displays the size, head element and all the elements of the queue
	*/	
	public void display() {
		if(count()>0) {
			System.out.println("Size - "+count()+"  Top - "+peek());
			System.out.println("Stack elements - ");
			for(int i=head;i>=0;i--)
				System.out.println(arr[i]);
		} else {
			System.out.println("queue is empty!");
		}
	}
}
