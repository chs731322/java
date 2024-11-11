package e04_inner;

import e04_inner.Outter.Inner;
import e04_inner.OutterStaticInnerClass.InnerStaticClass;

public class OutterMain {

	public static void main(String[] args) {
		// Inner class 생성은 Outter class가 생성이 되어야 가능함
//		Inner inner = new Inner(20);

		Outter outter1 = new Outter(10);
		Outter outter2 = new Outter(20);

		Inner inner1 = outter1.new Inner(100);
		inner1.printInner();
		Inner inner2 = outter1.new Inner(200);
		inner2.printInner();
		
		Inner inner3 = outter2.new Inner(300);
		inner3.printInner();
		Inner inner4 = outter2.new Inner(400);
		inner4.printInner();
		
		OutterStaticInnerClass osc = new OutterStaticInnerClass(300);
		InnerStaticClass isc = new InnerStaticClass(50);
		System.out.println(isc.sum());
		
	}
	
}