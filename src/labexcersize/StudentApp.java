package labexcersize;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCreate stuCre = new StudentCreate("Rohan", "344453");
		stuCre.setEmail("Lakshmi");
		System.out.println("\n" + "The Student Email is :" + stuCre.getEmail());
		stuCre.enroll("Math");
		stuCre.enroll("Science");
		stuCre.showCourses();
		stuCre.checkBalance();
		stuCre.payTution(400);
		stuCre.checkBalance();
		System.out.println(stuCre.toString());
	}

}

class StudentCreate{
	private static int id = 2000;
	private String userid;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	StudentCreate(String stuName, String stuSSN){
		id++;
		this.name = stuName;
		this.SSN = stuSSN;
		System.out.print("The Student Name is :" + stuName + " And the SSN is :" + stuSSN + "\n");
		System.out.print("The Student Name is :" + name + " And the SSN is :" + SSN);
		setUserID();
	}
	
	public void setEmail(String stuName) {
		email = stuName + "." + id +"@testuniversity.com";
	}
	public String getEmail() {
		return email;
	}
	public void setUserID() {
		int max = 9000;
		int min = 1000;				
		int random = (int) (Math.random() * ((max-min)));
		random = random + min;
		System.out.print("\n"+"The Random number is :" + random + "\n");
		userid = id + "" + 	random + SSN.substring(6);
		System.out.print("\n"+"The User ID is :" + userid + "\n");
	}
	public void enroll(String stuCource) {
		this.courses = stuCource + "\n" + this.courses;
		System.out.println("The Student Courses are :" + courses);
		balance = balance + costOfCourse;
		
	}
	public void payTution(int courseAmount) {
		balance = balance - courseAmount;
		System.out.println("Course Payment is :" + courseAmount);
		
	}
	public void checkBalance() {
		System.out.println("Course Balance is :" + balance);
	}
	public void showCourses() {
		System.out.println("Course Balance is :" + courses);
		
	}
	@Override
	public String toString() {
		return "[Name : " + name + "]\n[Courses: " + courses +"]\n[Balance :" + balance +"]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}