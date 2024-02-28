package datastr;

public class MyArrayList {

	private int[] list;
	private final int LIST_SIZE = 10;
	private int size = LIST_SIZE;
	private int counter = 0;
	
	//TODO
	//constructors isempty, isfull, howmanyelements
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
}
