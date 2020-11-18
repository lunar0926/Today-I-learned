package lab3;

public class Plane {
		public static int planes; // 정적 변수
		public static int getPlanes() {
			return planes;
		}
		private String maker;
		private String model;
		private int seats;
		// 필드 정의
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
		// 접근자와 설정자
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
		// 생성자 정의
}
