public class Lab2 {
	public static void main(String[] args){
		// Create a Student
		Student stu1 = new Student("Sharon", "555380987");
		Student stu2 = new Student("Thierry", "556380988");
		Student stu3 = new Student("Missy", "557381987");
		
		stu1.enroll("Math101");
		stu1.enroll("Eng101");
		stu1.enroll("His101");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		
		System.out.println(stu1.toString());
	}
}

class Student{
	// properties definition
	private static int ID = 1000; // can be any number
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn){
		ID++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	
	private void setEmail(){
		email = name.toLowerCase() + "." + ID + "@sdetuniversity.com";
		System.out.println("Your email is: " + email);
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	private void setUserID(){
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random()  * ((max - min)));
		randNum = randNum + min;
		//System.out.println(randNum);
		userID = ID + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userID);
	}
	
	public void enroll(String course){
		this.courses = this.courses + "\n" + course;
		//System.out.println(courses);
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount){
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		
	}
	
	public void checkBalance(){
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses(){
		System.out.println(courses);
	}
	
	public String toString(){
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: $" + balance + "]";
	}
	
}