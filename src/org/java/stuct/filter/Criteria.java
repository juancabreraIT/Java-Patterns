package org.java.stuct.filter;

import java.util.List;

public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
