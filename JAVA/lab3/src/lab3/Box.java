package lab3;

public class Box {
	private double width; // 가로
	private double depth; // 세로
	private double height; // 상자의 높이
	private boolean empty;
	public Box(double width, double depth, double height, boolean empty) {
		this.width=width;
		this.depth=depth;
		this.height=height;
		this.empty=empty;
	}
	public Box() {
		this.width=0;
		this.depth=0;
		this.height=0;
		this.empty=true;
	}
}
