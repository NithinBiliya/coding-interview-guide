import com.cig.ds.*;
import java.util.Scanner;

/**
* StackExample
*
* The StackExample class implements below -
*  1. Stack using linked list
*  2. Stack using array
*
* Below are the operations on the linked lists -
* 1. Push
* 2. Pop
* 3. Peek
* 4. Count
* 5. Clear
* 6. Display
* 7. Exit
*
*
* @author  Nithin Biliya
* @version 1.0
* @since   04/01/2018
*/

public class StackExample {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Select - ");
			System.out.println("1. Stack using linked list");
			System.out.println("2. Stack using array");
			String stackType=scanner.nextLine(), stackOperation, value;
			switch(stackType) {
				case "1" : 
					StackLinkedList<Integer> sll= new StackLinkedList<Integer>();
					for(String arg: args) {
						sll.push(Integer.parseInt(arg));
					}
					loop: while(true) {
						try {
							sll.display();
							System.out.println("Select - ");
							System.out.println("1. Push");
							System.out.println("2. Pop");
							System.out.println("3. Peek");
							System.out.println("4. Count");
							System.out.println("5. Clear");
							System.out.println("6. Display");
							System.out.println("7. Exit");
							System.out.print("Enter operation - ");
							stackOperation=scanner.nextLine();
							switch(stackOperation) {
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
									System.out.println("Size of stack - "+sll.count());
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
					StackArray sarr= new StackArray();
					for(String arg: args) {
						sarr.push(Integer.parseInt(arg));
					}
					loop: while(true) {
						try {
							sarr.display();
							System.out.println("Select - ");
							System.out.println("1. Push");
							System.out.println("2. Pop");
							System.out.println("3. Peek");
							System.out.println("4. Count");
							System.out.println("5. Clear");
							System.out.println("6. Display");
							System.out.println("7. Exit");
							System.out.print("Enter operation - ");
							stackOperation=scanner.nextLine();
							switch(stackOperation) {
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
									System.out.println("Size of stack - "+sarr.count());
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