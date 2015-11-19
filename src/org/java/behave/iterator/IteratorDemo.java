package org.java.behave.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		NameRepository namesRepository = new NameRepository();
		Iterator iter = namesRepository.getIterator();
		
		while(iter.hasNext()) {			
			String name = (String) iter.next();
			System.out.println("Name: " + name);
		}
	}

}
