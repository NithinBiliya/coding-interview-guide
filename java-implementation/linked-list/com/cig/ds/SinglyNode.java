package com.cig.ds;

/**
* SinglyNode
*
* The SinglyNode class implements a node for singly linked list
*
* @author  Nithin Biliya
* @version 1.0
* @since   03/01/2018
*/

public class SinglyNode<T> {
	private T value;
	private SinglyNode<T> next;
	
	/**
	* Constructor to initialize the node. next pointer will be null
	* @param value value to be used to initialize the node
	*/
	public SinglyNode(T value) {
		this.value=value;
		next=null;
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
	public void setNext(SinglyNode<T> next) {
		this.next=next;
	}
	
	/**
	* getter for next
	* @return SinglyNode returns the value of next
	*/
	public SinglyNode<T> getNext() {
		return next;
	}
}