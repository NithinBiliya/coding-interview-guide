import java.util.Stack;

/**
* InfixToPostfix
*
* The InfixToPostfix takes the infix expression from command line (first argument)
* and converts it to postfix expression and prints the output
*
* @author  Nithin Biliya
* @version 1.0
* @since   10/01/2018
*/

public class InfixToPostfix {

	private Stack<String> myStack;
	
	/**
	* Constructor to initialize the empty stack
	*/
	public InfixToPostfix() {
		myStack=new Stack<String>();
	}

	public static void main(String[] args) throws Exception {
		if(args.length==0) {
			System.out.println("infix expression string has to be sent in as first argument");
		} else {
			InfixToPostfix itp=new InfixToPostfix();
			System.out.println("posfix expression - "+itp.convert(args[0]));
		}
	}

	/** 
	* converts from infix to postfix
	* @param infix expression string
	* @return String postfix expression string
	* @throws Exception if there is invalid data in stack
	*/		
	public String convert(String infix) throws Exception {
		String tmp=null, postfix=new String();
		//myStack.push("(");
		infix="( "+infix+" )";
		for(String token : infix.split(" ")) {
			//System.out.println("token - "+token);
			//if(!myStack.empty()) System.out.println("top - "+myStack.peek());
			//System.out.println("postfix - "+postfix);
			//System.out.println("");
			if(getOperatorPrecedence(token)>0) { // if token is operator
				while(getOperatorPrecedence(myStack.peek())>0 && operatorPrecedence(token,myStack.peek())>=0) { // if top of stack is operator and operator token is higher precedence than top of stack
					postfix+=myStack.pop();
					postfix+=" ";
				}
				myStack.push(token);
			} else if(isBracket(token)<0) { // if token is an open bracket
				myStack.push(token);
			} else if(isBracket(token)>0) { // if token is close bracket
				do {
					tmp=myStack.pop();
					if(getOperatorPrecedence(tmp)>0) { // if tmp is operator
						postfix+=tmp;
						postfix+=" ";
					} else if(isBracket(tmp)<0 && isMatching(tmp,token)) { // if tmp is open bracket and is matching the closing bracket (token)
						break;
					} else {
						throw new Exception("Error - invalid data in stack - "+tmp);
					}
				} while(true);
			} else { // if token is operand
				postfix+=token;
				postfix+=" ";
			}
		}
		return postfix;
	}

	/** 
	* checks if the token is an operator adn returns it precedence
	* Supported operators - +(3),-(3),*(2),/(2),^(1)
	* @param token string to be checked if it is an operator
	* @return int returns the precedence of the operator. 0 if it is not an operator
	*/
	private int getOperatorPrecedence(String token) {
		switch(token) {
			case "+" :
			case "-" :
				return 3;
			case "*" :
			case "/" :
				return 2;
			case "^" :
				return 1;
			default :
				return 0;
		}
	}
	
	/** 
	* checks if the token is a bracket. Open or closed
	* Supported brackets - [,],{,},(,)
	* @param token string to be checked if it is a bracket
	* @return int returns -1 if open bracket, 1 ifi closed bracket, 0 if not a bracket
	*/
	private int isBracket(String token) {
		switch(token) {
			case "[" :
			case "{" :
			case "(" :
				return -1;
			case "]" :
			case "}" :
			case ")" :
				return 1;
			default :
				return 0;
		}
	}

	/** 
	* checks if openBracket matches the closeBracket
	* Supported brackets - [,],{,},(,)
	* @param openBracket open bracket
	* @param closeBracket close bracket
	* @return boolean returns true if the openBracket matches the closeBracket. else false.
	*/	
	private boolean isMatching(String openBracket,String closeBracket) {
	if((openBracket.equals("(") && closeBracket.equals(")")) || (openBracket.equals("[") && closeBracket.equals("]")) || (openBracket.equals("{") && closeBracket.equals("}"))) {
			return true;
		}
		return false;
	}
	
	/** 
	* checks the precedence of the operators
	* @param op1 first operator
	* @param op2 second operator
	* @return int returns 0 if op1=op2, returns 1 if op1>op2, returns -1 if op1<op2
	*/	
	private int operatorPrecedence(String op1,String op2) {
		if(getOperatorPrecedence(op1) > getOperatorPrecedence(op2)) return 1;
		else if(getOperatorPrecedence(op1) < getOperatorPrecedence(op2)) return -1;
		else return 0;
	}
}