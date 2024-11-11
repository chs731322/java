package e01_string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "    Hello   ";
		System.out.println(System.identityHashCode(str)); //1705929636
		
		str += 100; //작업이 이루어지면 새로 만듦
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //380936215
		
		str = str.replace("l", "a");
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //142638629
		
		System.out.println();
		
		//주소값이 다름
		
		//-------------------------------------------------
		
		//주소값이 같음
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder)); //707806938
		
		builder.append("AAAA");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder)); //707806938
		
		builder.replace(0, 4, "BBBB");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder)); //707806938
		
		builder.delete(0, 4);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder)); //707806938
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer)); //428746855
		
		buffer.append("TEST");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer)); //428746855
		
	}

}