import java.util.Stack;

/**
* PostfixCalculator
*
* The PostfixCalculator takes the postfix expression from command line 
* and evaluates it and prints the output
*
* @author  Nithin Biliya
* @version 1.0
* @since   04/01/2018
*/

public class PostfixCalculator {

	private Stack<Integer> myStack;
	
	/**
	* Constructor to initialize the empty stack
	*/
	public PostfixCalculator() {
		myStack=new Stack<Integer>();
	}

	public static void main(String[] args) {
		PostfixCalculator pc=new PostfixCalculator();
		System.out.println("answer - "+pc.evaluate(args));
	}
	
	public Integer evaluate(String[] expression) {
		Integer ans=null,op1,op2;
		try {
			for(String token: expression) {
				//System.out.println("\""+token+"\"");
				switch(token) {
					case "+": 
						op2=myStack.pop();
						op1=myStack.pop();
						myStack.push(op1+op2);
						break;
					case "-": 
						op2=myStack.pop();
						op1=myStack.pop();
						myStack.push(op1-op2);
						break;
					case "*": 
						op2=myStack.pop();
						op1=myStack.pop();
						myStack.push(op1*op2);
						break;
					case "/": 
						op2=myStack.pop();
						op1=myStack.pop();
						myStack.push(op1/op2);
						break;
					case "%": 
						op2=myStack.pop();
						op1=myStack.pop();
						myStack.push(op1%op2);
						break;
					default: 
						myStack.push(Integer.parseInt(token));
				}
			}
			ans=myStack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ans;
	}
	
}