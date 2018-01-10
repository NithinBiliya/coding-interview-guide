package com.cig.ds;

import java.util.LinkedList;
import java.util.ListIterator;

/**
* StackArray
*
* The StackArray class implements a stack data structure
* using an array
*
* @author  Nithin Biliya
* @version 1.0
* @since   04/01/2018
*/

public class StackArray {
	private int[] arr;
	private int minSize,top;

	/**
	* Constructor to initialize the array and top variables
	*/
	public StackArray() {
		minSize=2;
		arr=new int[minSize];
		top=-1;
	}

	/** 
	* performs push operation on the stack
	* @param value this is the value pushed onto the top of the stack
	*/	
	public void push(int value) {
		if(top==arr.length-1) {
			int[] tmp=arr;
			arr=new int[tmp.length*2];
			System.arraycopy(tmp,0,arr,0,tmp.length);
		}
		arr[++top]=value;
	}
	
	/** 
	* performs pop operation on the stack
	* @return int this is the value popped from the top of the stack
	*/	
	public int pop() {
		return arr[top--];
	}
	
	/** 
	* performs peek operation on the stack
	* @return int this returns the element that is there on the top of the stack
	*/	
	public int peek() {
		return arr[top];
	}
	
	/** 
	* size of the stack
	* @return int returns the size of the stack
	*/	
	public int count() {
		return top+1;
	}
	
	/** 
	* clears the stack
	*/	
	public void clear() {
		top=-1;
	}
	
	/** 
	* displays the size, top element and all the elements of the stack
	*/	
	public void display() {
		if(count()>0) {
			System.out.println("Size - "+count()+"  Top - "+peek());
			System.out.println("Stack elements - ");
			for(int i=top;i>=0;i--)
				System.out.println(arr[i]);
		} else {
			System.out.println("stack is empty!");
		}
	}
}
