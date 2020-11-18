package lab8;

class Phone {
	private String name; // 이름
	private String tel; // 전화번호
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	// 생성자

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// 설정자와 접근자 
}
