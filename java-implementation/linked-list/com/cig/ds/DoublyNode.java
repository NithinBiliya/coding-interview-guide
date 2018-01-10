package com.cig.ds;

/**
* DoublyNode
*
* The DoublyNode class implements a node for doubly linked list
*
* @author  Nithin Biliya
* @version 1.0
* @since   03/01/2018
*/

public class DoublyNode<T> {
	private T value;
	private DoublyNode<T> next, prev;
	
	/**
	* Constructor to initialize the node. next pointer and prev pointer will be null
	* @param value value to be used to initialize the node
	*/
	public DoublyNode(T value) {
		this.value=value;
		next=null;
		prev=null;
	}
	
	/**
	* setter for value
	* @param value value to set the value parameter of the node
	*/
	public void setValue(T value) {
		this.value=value;
	}
	
	/**
	* getter for value
	* @return T returns the value of the node
	*/
	public T getValue() {
		return value;
	}
	
	/** 
	* setter for next
	* @param next sets the next pointer
	*/
	public void setNext(DoublyNode<T> next) {
		this.next=next;
	}
	
	/**
	* getter for next
	* @return DoublyNode returns the value of next
	*/
	public DoublyNode<T> getNext() {
		return next;
	}
	/** 
	* setter for prev
	* @param prev sets the previous pointer
	*/
	public void setPrev(DoublyNode<T> prev) {
		this.prev=prev;
	}
	
	/**
	* getter for prev
	* @return DoublyNode returns the value of prev
	*/
	public DoublyNode<T> getPrev() {
		return prev;
	}
}