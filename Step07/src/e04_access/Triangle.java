package e04_access;
//가로
//높이
//생성자로 초기화
//삼각형 넓이 리턴하는 메서드
//삼각형 정보 출력

public class Triangle {
	private int w;
	private int h;
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public double triangleArea() {
		return w * h / 2.0 ;
	}

	@Override
	public String toString() {
		return w + " / " + h + " / " + triangleArea();
	}

}
