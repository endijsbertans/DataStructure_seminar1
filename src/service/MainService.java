package service;

import java.util.Arrays;

import datastr.MyArrayList;

public class MainService {

	public static void main(String[] args) {
	
		MyArrayList myList = new MyArrayList(3);
		
		myList.add(100);
		myList.add(200);
		myList.add(-100);
		try {
			myList.print();//100 200 -100
			myList.add(1, 1000);
			myList.print();//100 1000 200 -100
			myList.delete(0);
			myList.print();//1000 200 -100
			myList.add(200);
			myList.add(200);
			myList.print();//1000 200 -100 200 200
			System.out.println(myList.search(200));//1 3 4
			System.out.println(Arrays.toString(myList.getNeighbors(200)));//-100 200
			myList.print();//1000 200 -100 200 200
			myList.bubbleSort();
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