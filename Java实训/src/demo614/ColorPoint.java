package demo614;

class Point {
	protected final int x, y;
	private final String name;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		name = makeName();//[x,y]
		
	}

	protected String makeName() {
		System.out.println("makeName:.....");
		return "super:"+"[" + x + "," + y + "]";
	}

	public final String toString() {
		return name;
	}
}

public class ColorPoint extends Point {
	protected final String color;

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint:"+color);
	}

	protected String makeName() {
		System.out.println("makeName:"+color);
		return super.makeName() + ":" + color+"子类";
		
	}

	public static void main(String[] args) {
		System.out.println(new ColorPoint(4, 2, "Blue"));
		//先调用子类方法
	}
}