package assignment;
class Rectangle {
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public int getLrngth() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setLength(int length) {
		this .length=length;
	}
	public void setBreadth(int breadth) {
		this .breadth=breadth;
	}
	public int Area() {
		return length*breadth;
	}
	public int Perimeter() {
		return 2 *(length+breadth);
	}
}
public class Ques2 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle( 5, 9 );
		System.out.println("area is ");
		obj.Area();
		System.out.print("perimeter is ");
		obj.Perimeter();
		System.out.print("set new value");
		obj.setLength(59);
		obj.setBreadth(20);
		System.out.print( "area is" );
		obj.Area();
		System.out.println("perimeter is ");
		obj.Perimeter();

	}

}
