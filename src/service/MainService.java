package service;

import java.util.Arrays;
import java.util.Scanner;

import model.Student;
import datastr.MyArrayList;
import java.io.*; 

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
		
		MyArrayList<Student> myStudents = new MyArrayList<Student>();
		Student stud1 = new Student("Endijs", "Bertans");
		Student stud2 = new Student("Kristers", "Rukmanis");
		Student stud3 = new Student("Janis", "Baltais");
		myStudents.add(stud1);
		myStudents.add(stud2);
		try {
			myStudents.print();	
			myStudents.add(0, stud3);
			myStudents.print();
			System.out.println(myStudents.search(stud1));
			System.out.println(Arrays.toString(myStudents.getNeighbours(stud1)));
			myStudents.remove(1);
			myStudents.print();
			myStudents.sort();
			myStudents.print();
			myStudents.makeEmpty();
			myStudents.add(stud3);
			myStudents.print();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			MyArrayList<Integer> numbersFromFile = readFromFile("C:\\Users\\s22bertendi\\numbers.txt");
			numbersFromFile.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static MyArrayList<Integer> readFromFile(String path) throws Exception, FileNotFoundException, NumberFormatException{
		if(path == null || path.length() < 3) throw new Exception("problem ar file path");
		
		MyArrayList<Integer> listForNumbers = new MyArrayList<Integer>();
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			Integer tempNumber = Integer.parseInt(line);
			listForNumbers.add(tempNumber);
		}
		scanner.close();
		return listForNumbers;
	}

}