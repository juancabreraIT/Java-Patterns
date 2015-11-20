package org.java.behave.strategy;

public class OperationMultiply implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {

		return num1 * num2;
	}

}
