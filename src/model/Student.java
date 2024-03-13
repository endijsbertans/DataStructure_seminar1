package model;

public class Student {

	//1. variables
	private long sId;
	private String name;
	private String surname;
	
	private static long counter = 10000;
	//2. get and set
	public long getsId() {
		return sId;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	
	public void setsId() {
		this.sId = counter;
		counter++;
	}
		
	public void setName(String name) {
		if(name != null && name.matches("[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+"))
			this.name = name;
		else
			this.name = "---";
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+"))
			this.surname = surname;
		else
			this.surname = "---";
	}
	//3. constructors
	public Student() {
		setsId();
		setName("Janis");
		setSurname("Berzins");
	}
	
	public Student(String name, String surname) {
		setsId();
		setName(name);
		setSurname(surname);
	}
	//4.toString
	public String toString() {
		return sId + ":" + name + " " + surname;
	}
	//5. other functions
}