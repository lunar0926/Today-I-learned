package hw9;

public class ColorPoint extends Point {
	private String color; // 서브클래스에 color 필드 추가
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의" + " (" + getX() + "," + getY() + ")의 점"; 
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}

