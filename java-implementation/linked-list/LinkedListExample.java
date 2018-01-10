import com.cig.ds.*;
import java.util.Scanner;

/**
* LinkedListExample
*
* The LinkedListExample class implements below linked lists -
*  1. Singly linked list - with only head pointer
*  2. Singly linked list - with head and tail pointer
*  3. Singly linked list - with head and tail pointer and counter
*  4. Doubly linked list - with head and tail pointer and counter
*  5. Circular linked list - with head and tail pointer and counter
*
* Below are the operations on the linked lists -
*  1. Add at the head
*  2. Add at the tail
*  3. Delete at the head
*  4. Delete at the tail
*  5. Delete based on the value of the node
*  6. Search
*  7. Display
*  8. Clear
*  9. Exit
*
*
* @author  Nithin Biliya
* @version 1.0
* @since   03/01/2018
*/

public class LinkedListExample {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Select - ");
			System.out.println("1. Singly linked list - with only head pointer");
			System.out.println("2. Singly linked list - with head and tail pointer");
			System.out.println("3. Singly linked list - with head and tail pointer and counter");
			System.out.println("4. Doubly linked list - with head and tail pointer and counter");
			System.out.println("5. Circular linked list - with head and tail pointer and counter");
			String linkedListType=scanner.nextLine(), llOperation, value;
			switch(linkedListType) {
				case "1" : 
					System.out.println("WIP");
					break;
				case "2" :
					SinglyLinkedList<Integer> sll= new SinglyLinkedList<Integer>();
					for(String arg: args) {
						sll.addAtTail(new SinglyNode<Integer>(Integer.parseInt(arg)));
					}
					loop: while(true) {
						try {
							sll.display();
							System.out.println("Select - ");
							System.out.println("1. Add at the head");
							System.out.println("2. Add at the tail");
							System.out.println("3. Delete at the head");
							System.out.println("4. Delete at the tail");
							System.out.println("5. Delete based on the value of the node");
							System.out.println("6. Search");
							System.out.println("7. Display");
							System.out.println("8. Clear");
							System.out.println("9. Exit");
							System.out.print("Enter operation - ");
							llOperation=scanner.nextLine();
							switch(llOperation) {
								case "1": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									sll.addAtHead(new SinglyNode<Integer>(Integer.parseInt(value)));
									break;
								case "2": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									sll.addAtTail(new SinglyNode<Integer>(Integer.parseInt(value)));
									break;
								case "3": 
									System.out.println("Value deleted - "+sll.deleteAtHead().getValue());
									break;
								case "4": 
									System.out.println("Value deleted - "+sll.deleteAtTail().getValue());
									break;
								case "5": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									System.out.println("Value deleted - "+sll.deleteFirstOccurance(Integer.parseInt(value)).getValue());
									break;
								case "6": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									System.out.println("Value found - "+sll.search(Integer.parseInt(value)));
									break;
								case "7": 
									sll.display();
									break;
								case "8": 
									sll.clear();
									break;
								case "9": 
									break loop;
								default: 
									System.out.println("Invalid input");
									break;
							}

						} catch (Exception e) {
							System.out.println("Exeption - "+e);
						}
					}
					break;
				case "3" :
					SinglyLinkedList2<Integer> sll2= new SinglyLinkedList2<Integer>();
					for(String arg: args) {
						sll2.addAtTail(new SinglyNode<Integer>(Integer.parseInt(arg)));
					}
					loop: while(true) {
						try {
							sll2.display();
							System.out.println("Select - ");
							System.out.println("1. Add at the head");
							System.out.println("2. Add at the tail");
							System.out.println("3. Delete at the head");
							System.out.println("4. Delete at the tail");
							System.out.println("5. Delete based on the value of the node");
							System.out.println("6. Search");
							System.out.println("7. Display");
							System.out.println("8. Clear");
							System.out.println("9. Exit");
							System.out.print("Enter operation - ");
							llOperation=scanner.nextLine();
							switch(llOperation) {
								case "1": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									sll2.addAtHead(new SinglyNode<Integer>(Integer.parseInt(value)));
									break;
								case "2": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									sll2.addAtTail(new SinglyNode<Integer>(Integer.parseInt(value)));
									break;
								case "3": 
									System.out.println("Value deleted - "+sll2.deleteAtHead().getValue());
									break;
								case "4": 
									System.out.println("Value deleted - "+sll2.deleteAtTail().getValue());
									break;
								case "5": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									System.out.println("Value deleted - "+sll2.deleteFirstOccurance(Integer.parseInt(value)).getValue());
									break;
								case "6": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									System.out.println("Value found - "+sll2.search(Integer.parseInt(value)));
									break;
								case "7": 
									sll2.display();
									break;
								case "8": 
									sll2.clear();
									break;
								case "9": 
									break loop;
								default: 
									System.out.println("Invalid input");
									break;
							}

						} catch (Exception e) {
							System.out.println("Exeption - "+e);
						}
					}
					break;
				case "4" :
					DoublyLinkedList<Integer> dll= new DoublyLinkedList<Integer>();
					for(String arg: args) {
						dll.addAtTail(new DoublyNode<Integer>(Integer.parseInt(arg)));
					}
					loop: while(true) {
						try {
							dll.display();
							System.out.println("Select - ");
							System.out.println("1. Add at the head");
							System.out.println("2. Add at the tail");
							System.out.println("3. Delete at the head");
							System.out.println("4. Delete at the tail");
							System.out.println("5. Delete based on the value of the node");
							System.out.println("6. Search");
							System.out.println("7. Display");
							System.out.println("8. Clear");
							System.out.println("9. Exit");
							System.out.print("Enter operation - ");
							llOperation=scanner.nextLine();
							switch(llOperation) {
								case "1": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									dll.addAtHead(new DoublyNode<Integer>(Integer.parseInt(value)));
									break;
								case "2": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									dll.addAtTail(new DoublyNode<Integer>(Integer.parseInt(value)));
									break;
								case "3": 
									System.out.println("Value deleted - "+dll.deleteAtHead().getValue());
									break;
								case "4": 
									System.out.println("Value deleted - "+dll.deleteAtTail().getValue());
									break;
								case "5": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									System.out.println("Value deleted - "+dll.deleteFirstOccurance(Integer.parseInt(value)).getValue());
									break;
								case "6": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									System.out.println("Value found - "+dll.search(Integer.parseInt(value)));
									break;
								case "7": 
									dll.display();
									break;
								case "8": 
									dll.clear();
									break;
								case "9": 
									break loop;
								default: 
									System.out.println("Invalid input");
									break;
							}

						} catch (Exception e) {
							System.out.println("Exeption - "+e);
						}
					}
					break;
				case "5" :
					System.out.println("WIP");
					break;
				default :
					System.out.println("Invalid input");
			}

		} catch (Exception e) {
			System.out.println("Exeption - "+e);
		}
	}
}