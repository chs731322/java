package e05_interface;

public class InterAMain {
	public static void run(InterA in) {
		in.interA();
	}
	public static void main(String[] args) {
		InterAClass aClass = new InterAClass();
		InterBClass bClass = new InterBClass();
		InterCClass cClass = new InterCClass();
		
		aClass.interA();
		bClass.interA(); 
		cClass.interA();
		
		run(aClass);
		run(bClass);
		run(cClass);
	}

}
