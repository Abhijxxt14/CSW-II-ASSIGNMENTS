package assignment;
class Car { 
	private int make;
	private String model;
	public Car(int make , String model) {
		this.make=make;
		this.model=model;
	}
	public int getMake() {
		return make;
	}
	public String getModel() {
	return model;
	}
	public void setMake(int make) {
		this.make=make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void displayd() {
		System.out.println(make + model);
	}
	
}

public class Ques1{

	public static void main(String[] args) {
	Car mycar1 = new Car( 2016," ABC ");
	Car mycar2 = new Car(0, null);
	System.out.print("car 1 "  );
	mycar1.displayd();
	System.out.print("car 2 "  );
	mycar2.displayd();
	mycar2.setMake(20);
	mycar2.setModel(" GHI ");
	System.out.println("now car 2 is ");
	mycar2.displayd();
	
	}

}
