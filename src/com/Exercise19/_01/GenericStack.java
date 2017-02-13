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

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	public E peek() {
		return get(size() - 1);
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}
