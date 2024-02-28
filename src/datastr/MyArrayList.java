package datastr;

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
		if(index < 0 || index > counter) throw new Exception("Out of bounds index"); 
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
}
