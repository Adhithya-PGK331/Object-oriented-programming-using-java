package Encapsulation_programs;

public class Stud1 {
	String name;//auto generate getter setter methods by
	int id;//right click-->>source-->>generate getters &setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {//<access specifier> < return type> < method>
		return id;
	}
	public void setId(int id) {
		this.id = id;
}
}