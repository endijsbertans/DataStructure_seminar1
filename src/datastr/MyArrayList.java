package datastr;

public class MyArrayList {

	private int[] list;
	private final int LIST_SIZE = 10;
	private int size = LIST_SIZE;
	private int counter = 0;
	
	//TODO
	//constructors, isempty, isfull, howmanyelements
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
	//TODO
	// Funkc deklarc.
	// ienakosie parametr japarbaud
	// aprekinat newSize
	// izveidot ListNew ar newSize izmer
	// veic kopesanu
	// nomaina list referenci uz listNew
	// izsauc garbagecollector
	// size nomaina uz newsize
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
}
