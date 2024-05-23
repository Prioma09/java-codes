package dsa_array;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
//		ArrayList<type> al = new ArrayList<Type>
		ArrayList<Integer> al=new ArrayList<Integer>(2);
		al.add(1);
		al.add(2);
		System.out.println(al.get(0));
		System.out.println(al.get(1));		
	}

}
