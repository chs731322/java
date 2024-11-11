package e01_object;

public class Circle implements Cloneable {
	private Point pos;
	private int r;

	// 필드 초기화하는 생성자
	// set / get 메서드
	// clone
	// toString

	public Circle(Point pos, int r) {
		this.pos = pos;
		this.r = r;
	}

	@Override
	public String toString() {
		return "[pos = " + pos + ", r = " + r + "]";
	}

	public Point getPos() {
		return pos;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	/*
	 * 
	 * 깊은 복사(Deep Copy) :
	 * 객체의 모든 필드를 새로운 메모리 공간에 복사하며, 
	 * 참조 타입 필드도 별도로 복사하여 독립된 객체를 만듭니다. 
	 * 복사본과 원본 객체는 서로 완전히 독립적입니다.
	 * 
	 */
	public Circle clone() {
		Point p = pos.clone(); // 참조형 데이터도 복제
		return new Circle(p, r);
	}

}
