package Collection02;

import java.util.*;
public class Computer<T> {

	private Vector<T> v;
	
	public Computer() {
		v = new Vector<T>();
	}
	
	public void add(T t) {
		v.add(t);
	}
	
	public int size() {
		return v.size();
	}
}
