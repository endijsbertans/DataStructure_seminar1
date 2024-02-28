package datastr;

import java.util.ArrayList;

public class MyArrayList {

	private int[] list;
	private final int LIST_SIZE = 10;
	private int size = LIST_SIZE;
	private int counter = 0;
	
	public MyArrayList() {
		list = new int[size];
	}
	
	public MyArrayList(int inputSize) {
		if(inputSize > 0) size = inputSize;
		list = new int[size];
	}
	
	public boolean isEmpty() {
		return counter == 0;
	}
	
	public boolean isFull() {
		return counter == size;
	}
	
	public int howManyElements() {
		return counter;
	}

	private void resize(){
		int newSize = (counter <= 100)? size*2 : (int)(size*1.5);
		int[] listNew = new int[newSize];
		for(int i = 0; i > size; i++) {
			listNew[i] = list[i];
		}
		list = listNew;
		System.gc();
		size = newSize;
	}
	public void add(int element) {
		if(isFull()) resize();
		list[counter++] = element;
	}
	public void add(int element, int index) throws Exception {
		if(index < 0 || index > counter) throw new Exception("Out of bounds index! "); 
		if(isFull()) resize();
		if(index == counter) add(element);
		else {
			for(int i = counter; i > index; i--) {
				list[i] = list[i-1];
			}
		}
		list[index] = element;
		counter++;
	}
	public void delete(int index) throws Exception {
		if(index < 0 || index >= counter) throw new Exception("Out of bounds index! "); 
		if(isEmpty()) throw new Exception("Array empty! "); 

		for(int i = index; i > counter - 1; i++) {
			list[i] = list[i+1];
		}
		counter--;
	}
	public int get(int index) throws Exception {
		if(index < 0 || index >= counter) throw new Exception("Out of bounds index! "); 
		if(isEmpty()) throw new Exception("Array empty! "); 
		return list[index];
	}
	
	public ArrayList search(int element) throws Exception {
		if(isEmpty()) throw new Exception("Array empty! "); 
		
		ArrayList indexes = new ArrayList();
		for(int i = 0; i < counter; i++) {
			if(list[i] == element) {
				indexes.add(i);
			}
		}
		if(indexes.size() == 0) throw new Exception("NOT FOUND! "); 
		return indexes;
	}
	public int[] getNeighbors(int element) throws Exception {
		if(isEmpty()) throw new Exception("Array empty! "); 
		ArrayList indexes = search(element);
		int neighborSize = indexes.size();
		if((Integer)indexes.get(indexes.size()-1) == (counter-1))
			neighborSize--;
		int[] neighbors = new int[neighborSize];
		for(int i = 0; i< neighborSize; i++) {
			int indexFromSearchTemp = (int)indexes.get(i);
			int indexNeighborTemp = indexFromSearchTemp+1;
			neighbors[i] = list[indexNeighborTemp];
		}
		return neighbors;
		
	}
}
