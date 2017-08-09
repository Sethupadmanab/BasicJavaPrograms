package com.stackprograms;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		 Stack s = new Stack();
		 s.push("A");
		 s.push("B");
		 s.push("C");
		 System.out.println(s);
		 System.out.println(s.peek()); //just retuns the value from top of the  stack
		 System.out.println(s.pop());  //retuns and remove the value from top of the  stack
		 System.out.println(s.search("C")); // returns the offset if the element found
		 System.out.println(s.search("Z")); // returs -1 if the element not found.

	}

}
