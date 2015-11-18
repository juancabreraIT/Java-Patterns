package org.java.stuct.proxy;

public class ProxyDemo {

	public static void main(String[] args) {

		Image image = new ProxyImage("test_19mb.jpg");
		
		image.display();
		System.out.println("");
		
		image.display();
	}

}
