package lab3;

public class Box {
	private double width; // ����
	private double depth; // ����
	private double height; // ������ ����
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
