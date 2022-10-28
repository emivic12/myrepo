package cts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Collectionex {

	public static void main(String[] args) {
		Collection<Integer> cl=new ArrayList<Integer>();
		cl.add(1);
		cl.add(2);
		cl.add(4);
		cl.remove(4);
		Collections.addAll(cl, 2,6,7);
		Iterator<Integer> it=cl.iterator();
	 while(it.hasNext()) {
		int value= it.next();
		System.out.println(value);
		
	}

	}

}
