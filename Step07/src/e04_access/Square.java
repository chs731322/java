package e04_access;

/*
 * 사각형 클래스

		가로길이, 세로길이
		생성자로 초기화
		사각형 넓이 리턴하는 메서드
		사각형 정보 출력
			-가로길이, 세로길이, 넓이
		필드는 private 지정
 */
public class Square {
	private int w;
	private int h;
	

	//생성자로 초기화
	public Square(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	//가로 길이 set, get 메서드
	public void setw(int w) {
		this.w = w;
	}
	
	public int getw(int w) {
		return w;
	}
	
	//세로 길이 set, get 메서드
	public void seth(int h) {
		this.h = h;
	}
	
	public int geth(int h) {
		return h;
	}
	
	public int square() {
		return w*h;
	}

	//사각형 정보 출력
	@Override
	public String toString() {
		return "Square [가로 길이 = " + w + ", 세로 길이 = " + h + ", 넓이 = " + square() + "]";
	}
	
}
