package org.java.create.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		SingleObject single = SingleObject.getInstance();
		
		single.showMessage();

	}

}
