/*--------------------------------------------------------------------
Name: Jaime Palencia
Student ID: U94665425
COP 2805C - Java Programming 2
Spring /2017
Assignment # 2
Plagiarism Statement
I certify that this assignment is my own work and that I
have not copied in part or whole or otherwise plagiarized 
the work of other students and/or persons.
--------------------------------------------------------------------*/
package com.Exercise19._01;

import java.util.Scanner;

public class TestGenericStack {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		GenericStack<String> stk = new GenericStack<>(); 

		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) 
			stk.push(input.next());

		
		while (!stk.isEmpty())
			System.out.print(stk.pop() + " ");
		System.out.println();
	}
}