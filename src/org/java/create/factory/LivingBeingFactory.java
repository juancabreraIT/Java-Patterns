package org.java.create.factory;

public class LivingBeingFactory {
	
	public LivingBeing getLivingBeing(String type) {
		
		if ( type == null ) {
			return null;
		}
		
		if ( type.equalsIgnoreCase("HUMAN") ) {
			return new Human();
		} else if ( type.equalsIgnoreCase("ANIMAL") ) {
			return new Animal();
		} else if ( type.equalsIgnoreCase("PLANT") ) {
			return new Plant();
		}
		
		return null;
	}

}
