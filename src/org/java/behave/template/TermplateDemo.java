package org.java.behave.template;

public class TermplateDemo {

	public static void main(String[] args) {
		
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
