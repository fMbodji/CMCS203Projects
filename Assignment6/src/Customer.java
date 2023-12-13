/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Customer data element class
 * Due: 12/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
   Print your Name here:Fatima Mbodji
*/

public class Customer {
	
	private String name;
	private int age;
	
	public Customer(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public Customer(Customer c)
	{
		this.name = c.name;
		this.age = c.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		 this.name=name;
	}
	
	public void setAge(int age) {
		 this.age=age;
	}
	
	public String toString() {
		return this.name + " " + this.age; 
	}
}
