package assignment;
class Point{
	private int x;
	private int y;
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Point (Point point_2) {
		this.x= point_2.x;
		this.y= point_2.y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
}

public class Ques3 {

	public static void main(String[] args) {
		Point obj1 = new Point(59, 0);
		Point obj2 = new Point(0, 27);
		System.out.println("first point values " +obj1.getX()  + " "+ obj1.getY() );
		System.out.println("second point values " + obj2.getX() + " "+ obj2.getY());
		

	}

}
