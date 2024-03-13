package service;

import java.util.Arrays;

import datastr.MyArrayList;


//TODO nokopēt Student klasi un ielikt model pakotnē
//TODO izveidot MyArrayList<Student> un to notestēt ar visām funkcijām
public class MainService {

	public static void main(String[] args) {
	
		MyArrayList<Integer> myList = new MyArrayList<Integer>(3);
		
		myList.add(100);
		myList.add(200);
		myList.add(-100);
		try {
			myList.print();//100 200 -100
			myList.add(1, 1000);
			myList.print();//100 1000 200 -100
			myList.remove(0);
			myList.print();//1000 200 -100
			myList.add(200);
			myList.add(200);
			myList.print();//1000 200 -100 200 200
			System.out.println(myList.search(200));//1 3 4
			System.out.println(Arrays.toString(myList.getNeighbours(200)));//-100 200
			myList.print();//1000 200 -100 200 200
			myList.sort();
			myList.print();
			
			myList.makeEmpty();
			myList.add(100000);
			myList.print();//100000
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}