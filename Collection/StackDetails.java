package collection;

import java.util.Stack;

public class StackDetails {

	public static void main(String[] args) {
		
		//it extends vector list
		Stack<Integer>  stack= new Stack<>();
		
		//it add the element in stack 
		System.out.println(stack.push(3));//push add the element in the stack and return that
		//element
		stack.push(4);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		//it print full stack elements 
		System.out.println(stack);
		
	    //it return last element and remove it
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		//it return last element and don't delete
		System.out.println(stack.peek());
		
		
		//it return that element position from right to left  if element not here return -1
		System.out.println(stack.search(4));
		
	}

}
