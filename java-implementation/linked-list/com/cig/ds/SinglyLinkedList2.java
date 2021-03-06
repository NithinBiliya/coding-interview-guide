package com.cig.ds;

/**
* SinglyLinkedList2
*
* The SinglyLinkedList2 class implements a singly linked list which has 
* both head and tail pointers and a counter which stores the number of nodes in the list
*
* @author  Nithin Biliya
* @version 1.0
* @since   03/01/2018
*/

public class SinglyLinkedList2<T> {
	private SinglyNode<T> head,tail;
	private int count;
	
	/**
	* Constructor to initialize the head and tail variables
	*/
	public SinglyLinkedList2() {
		head=null;
		tail=null;
		count=0;
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
	* getter for count variable 
	* @return int returns count value - number of nodes in the list
	*/
	public int getCount() {
		return count;
	}
	
	/** 
	* addAtHead() method adds the newNode at the beginning of the list
	* @param newNode this is the new node that is to be added into the list
	*/
	public void addAtHead(SinglyNode<T> newNode) {
		newNode.setNext(head);
		head=newNode;
		if(count==0)
			tail=newNode;
		count++;
	}
	
	/** 
	* addAtTail() method adds the newNode at the end of the list
	* @param newNode this is the new node that is to be added into the list
	*/
	public void addAtTail(SinglyNode<T> newNode) {
		newNode.setNext(null);
		if(count>0)
			tail.setNext(newNode);
		else
			head=newNode;
		tail=newNode;
		count++;
	}
	
	/** 
	* deleteAtHead() method deletes the first node at the beginning of the list
	* @return SinglyNode returns the deleted node
	* @exception Exception throws exception if linked list is empty
	*/
	public SinglyNode<T> deleteAtHead() throws Exception {
		if(count==0) {
			throw new Exception("Linked list is empty!");
		}
		SinglyNode<T> temp=head;
		head=temp.getNext();
		count--;
		if(count==0)
			tail=null;
		return temp;
	}
	
	/** 
	* deleteAtTail() method deletes the last node at the end of the list
	* @return SinglyNode returns the deleted node
	* @exception Exception throws exception if linked list is empty
	*/
	public SinglyNode<T> deleteAtTail() throws Exception {
		if(count==0) {
			throw new Exception("Linked list is empty!");
		}
		SinglyNode<T> temp=tail;
		SinglyNode<T> prev=null,curr;
		for(curr=head;curr.getNext()!=null;prev=curr,curr=curr.getNext());
		count--;
		if(count==0) {
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
		if(count==0) {
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
		count--;
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
		System.out.println("count - "+count);
		if(count>0)
			System.out.println("Head="+head.getValue()+"  Tail="+tail.getValue());
		System.out.print("Linked list items -- ");
		for(SinglyNode<T> curr=head;curr!=null;curr=curr.getNext())
			System.out.print(curr.getValue()+"  ");
		System.out.println("");
	}
	
	/** clear() method clears the list*/
	public void clear() {
		head=null;
		tail=null;
		count=0;
	}
}