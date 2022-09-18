package Collection02;

import java.util.Comparator;

public class StringSort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if( o1 == o2)
			return 0;
		if( o1 == null) {
			return -1;
		}
		if( o2 == null) {
			return 1;
		}
		if(o1.length() == o2.length())
			return 0;
		if(o1.length() > o2.length())
			return -1;
		
		return 1;
	}

}
