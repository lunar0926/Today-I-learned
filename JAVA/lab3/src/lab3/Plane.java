package lab3;

public class Plane {
		public static int planes; // ���� ����
		public static int getPlanes() {
			return planes;
		}
		private String maker;
		private String model;
		private int seats;
		// �ʵ� ����
		public String getMaker() {
			return maker;
		}
		public void setMaker(String maker) {
			this.maker = maker;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getSeats() {
			return seats;
		}
		public void setSeats(int seats) {
			this.seats = seats;
		}
		// �����ڿ� ������
		public Plane(String maker, String model, int seats) {
			this.maker=maker;
			this.model=model;
			this.seats=seats;
			planes++;
		}
		public Plane(String model, int seats) {
			this.model=model;
			this.seats=seats;
			planes++;
		}
		// ������ ����
}
