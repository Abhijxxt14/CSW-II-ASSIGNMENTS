package assignment;
class Student {
	private String name;
	private int age;
	private Object rollNumber;
	
	public Student(String name , int age , Object rollNumber) {
		this.name=name;
		this.age=age;
		this.rollNumber=rollNumber;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name ) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public Object getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Object rollNumber) {
		this.rollNumber=rollNumber;
	}
	@Override
	public String toString() {
	return "Student{" +"name='" + name +", rollNumber=" + rollNumber +", age=" + age +'}';
	}
}

public class Test {

	public static void main(String[] args) {
		Student std1 = new Student("abj" , 23,"fiftyfive");
		Student std2 = new Student("gdg" , 21,21);
		System.out.println(std1);
		System.out.println(std2);
		
	}
}
