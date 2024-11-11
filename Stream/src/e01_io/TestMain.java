package e01_io;

public class TestMain {

	public static void main(String[] args) {
		IOTest io = new IOTest();
		System.out.println(io.readline());
		String str = "message";
		io.println(str);
	}

}
