package com.cig.ds;

/**
* SinglyLinkedList
*
* The SinglyLinkedList class implements a singly linked list which has 
* both head and tail pointers. No count variable to store the count
*
* @author  Nithin Biliya
* @version 1.0
* @since   03/01/2018
*/

public class SinglyLinkedList<T> {
	private SinglyNode<T> head,tail;

	/**
	* Constructor to initialize the head and tail variables
	*/
	public SinglyLinkedList() {
		head=null;
		tail=null;
	}
	
	/** 
	* getter for head variable 
	* @return SinglyNode returns the head node
	*/
	public SinglyNode<T> getHead() {
		return head;
	}
	
	/** 
	* getter for tail variable 
	* @return SinglyNode returns the tail node 
	*/
	public SinglyNode<T> getTail() {
		return tail;
	}
	
	/** 
	* addAtHead() method adds the newNode at the beginning of the list
	* @param newNode this is the new node that is to be added into the list
	*/
	public void addAtHead(SinglyNode<T> newNode) {
		newNode.setNext(head);
		head=newNode;
		if(tail==null)
			tail=newNode;
	}
	
	/** 
	* addAtTail() method adds the newNode at the end of the list
	* @param newNode this is the new node that is to be added into the list
	*/
	public void addAtTail(SinglyNode<T> newNode) {
		newNode.setNext(null);
		if(tail!=null)
			tail.setNext(newNode);
		tail=newNode;
		if(head==null)
			head=newNode;
	}
	
	/** 
	* deleteAtHead() method deletes the first node at the beginning of the list
	* @return SinglyNode returns the deleted node
	* @exception Exception throws exception if linked list is empty
	*/
	public SinglyNode<T> deleteAtHead() throws Exception {
		if(head==null) {
			throw new Exception("Linked list is empty!");
		}
		SinglyNode<T> temp=head;
		head=temp.getNext();
		if(head==null)
			tail=null;
		return temp;
	}
	
	/** 
	* deleteAtTail() method deletes the last node at the end of the list
	* @return SinglyNode returns the deleted node
	* @exception Exception throws exception if linked list is empty
	*/
	public SinglyNode<T> deleteAtTail() throws Exception {
		if(tail==null) {
			throw new Exception("Linked list is empty!");
		}
		SinglyNode<T> temp=tail;
		SinglyNode<T> prev=null,curr;
		for(curr=head;curr.getNext()!=null;prev=curr,curr=curr.getNext());
		if(prev==null) {
			head=null;
		} else {
			prev.setNext(null);
		}
		tail=prev;
		return temp;
	}
	
	/** 
	* deleteFirstOccurance() method deletes the first node which matches the value
	* @param value a node with this values has to be deleted if it exists in the list
	* @return SinglyNode returns the deleted node
	* @exception Exception throws exception if linked list is empty
	*/
	public SinglyNode<T> deleteFirstOccurance(T value) throws Exception {
		if(head==null) {
			throw new Exception("Linked list is empty!");
		}
		SinglyNode<T> curr=null,prev=null;
		for(curr=head;curr!=null && value!=curr.getValue();prev=curr,curr=curr.getNext());
		if(curr==null)
			throw new Exception("Element not found!");
		if(prev!=null)
			prev.setNext(curr.getNext());
		if(head==curr)
			head=curr.getNext();
		if(tail==curr)
			tail=prev;
		return curr;
	}
	
	/** 
	* search() method checks if the node with the specified value exists
	* @param value a node with this values has to be searched in the list
	* @return boolean true if node with the specified values exsts. else false
	*/
	public boolean search(T value) {
		for(SinglyNode<T> curr=head;curr!=null;curr=curr.getNext())
			if(curr.getValue()==value)
				return true;
		return false;
	}
	
	/** 
	* display() method displays all the nodes in the list along with the head and tail nodes and the number of nodes
	*/
	public void display() {
		if(head!=null)
			System.out.println("Head="+head.getValue()+"  Tail="+tail.getValue());
		System.out.print("Linked list items -- ");
		int count=0;
		SinglyNode<T> curr=null;
		for(curr=head,count=0;curr!=null;curr=curr.getNext(),count++)
			System.out.print(curr.getValue()+"  ");
		System.out.println("");
		System.out.println("count - "+count);
	}
	
	/** clear() method clears the list*/
	public void clear() {
		head=null;
		tail=null;
	}
}