package oops;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " Is Walking");
		
	}
	void email() {
		System.out.println(email + " Is Email of the Person");
	}
	void phone() {
		System.out.println(phone + " Is the Phone Number of the Person");
	}
}

public class DemoOnOops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person();
		per.name = "Rohan";
		per.email = "test@test.com";
		per.phone = "2934334343";
		per.walk();
		per.email();
		per.phone();
		
		Person per1 = new Person();
		per1.email = "lakshmikannikanti@test.com";
		per1.email();
	
	}

}
