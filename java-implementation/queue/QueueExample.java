import com.cig.ds.*;
import java.util.Scanner;

/**
* QueueExample
*
* The QueueExample class implements below -
*  1. Queue using linked list
*  2. Queue using array
*
* Below are the operations on queue -
* 1. Enqueue
* 2. Dequeue
* 3. Peek
* 4. Count
* 5. Clear
* 6. Display
* 7. Exit
*
*
* @author  Nithin Biliya
* @version 1.0
* @since   07/02/2018
*/

public class QueueExample {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Select - ");
			System.out.println("1. Queue using linked list");
			System.out.println("2. Queue using array");
			String queueType=scanner.nextLine(), queueOperation, value;
			switch(queueType) {
				case "1" : 
					QueueLinkedList<Integer> sll= new QueueLinkedList<Integer>();
					for(String arg: args) {
						sll.push(Integer.parseInt(arg));
					}
					loop: while(true) {
						try {
							sll.display();
							System.out.println("Select - ");
							System.out.println("1. Enqueue");
							System.out.println("2. Dequeue");
							System.out.println("3. Peek");
							System.out.println("4. Count");
							System.out.println("5. Clear");
							System.out.println("6. Display");
							System.out.println("7. Exit");
							System.out.print("Enter operation - ");
							queueOperation=scanner.nextLine();
							switch(queueOperation) {
								case "1": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									sll.push(Integer.parseInt(value));
									break;
								case "2": 
									System.out.println("Value popped - "+sll.pop());
									break;
								case "3": 
									System.out.println("Top element - "+sll.peek());
									break;
								case "4": 
									System.out.println("Size of queue - "+sll.count());
									break;
								case "5": 
									sll.clear();
									break;
								case "6": 
									sll.display();
									break;
								case "7": 
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
				case "2" :
					QueueArray sarr= new QueueArray();
					for(String arg: args) {
						sarr.push(Integer.parseInt(arg));
					}
					loop: while(true) {
						try {
							sarr.display();
							System.out.println("Select - ");
							System.out.println("1. Enqueue");
							System.out.println("2. Dequeue");
							System.out.println("3. Peek");
							System.out.println("4. Count");
							System.out.println("5. Clear");
							System.out.println("6. Display");
							System.out.println("7. Exit");
							System.out.print("Enter operation - ");
							queueOperation=scanner.nextLine();
							switch(queueOperation) {
								case "1": 
									System.out.print("Enter value - ");
									value=scanner.nextLine();
									sarr.push(Integer.parseInt(value));
									break;
								case "2": 
									System.out.println("Value popped - "+sarr.pop());
									break;
								case "3": 
									System.out.println("Top element - "+sarr.peek());
									break;
								case "4": 
									System.out.println("Size of queue - "+sarr.count());
									break;
								case "5": 
									sarr.clear();
									break;
								case "6": 
									sarr.display();
									break;
								case "7": 
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
				default :
					System.out.println("Invalid input");
			}

		} catch (Exception e) {
			System.out.println("Exeption - "+e);
		}
	}
}