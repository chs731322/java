package e04_inner;

public class OutterStaticInnerClass {
	private int outter;
	private static int n =  100;

	public OutterStaticInnerClass(int outter) {
		this.outter = outter;
	}
	
	public static class InnerStaticClass {
		private int inner;

		public InnerStaticClass(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
			// Inner 클래스가 static이기 때문에 누구의 outter 필드인지 모름
			// static은 non-static에 접근할 수 없다.
//			return outter + inner;
			return n + inner;
		}
		
	}
	
}
