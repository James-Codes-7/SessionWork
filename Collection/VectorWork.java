package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorWork {
	

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<>();
		
		//vector is thread safe all method have synchronized key word
		vector.add(4);
		vector.add(3);
		vector.add(1);
		vector.add(4);
		System.out.println(vector);
		
		List<Integer> list=new ArrayList<>();
		//it add sequential order
		list.add(4);//it return boolean
		list.add(6);
		list.add(7);
		
		//it add the element which position you want
		vector.add(0, 7);//it return void
		System.out.println(vector);
		
		//it add the list which position you give that position it add all the elements of list
		vector.addAll(1, list);//it return boolean
		System.out.println(vector);
		
		
		//it remove all the list element from the vector it also remove the elements same in vector
		vector.removeAll(list);//it return boolean
		System.out.println(vector);
		
		
		//it add the list end of the vector
		vector.addAll(list);
		System.out.println(vector);
		
		//it add the element which position you want
		vector.add(vector.size()-2, 10);
		System.out.println(vector);
		
		
		//it return current capacity of the vector
		System.out.println(vector.capacity());
		
		
		//it check the  elements in the vector
		System.out.println(vector.contains(9));//it return true or false
		
		//it check all the list elements present in the vector 
		System.out.println(vector.containsAll(list));//return true or false;
		
		
		//it return that index element if index wrong throw exception
		System.out.println(vector.elementAt(5));
		
		//return the element in that position else throw exception
		System.out.println(vector.get(3));
		
		//it return that element index else return -1;
		System.out.println(vector.indexOf(3, 0));
		
		//it return true or false
		System.out.println(vector.isEmpty());
	
	
		
		

	}

}
