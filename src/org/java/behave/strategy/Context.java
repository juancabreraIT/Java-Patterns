package org.java.behave.strategy;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executesStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
