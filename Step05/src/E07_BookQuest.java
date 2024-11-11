
public class E07_BookQuest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		} else if(operator == '-') {
			System.out.println(num1 - num2);
		} else if(operator == '*') {
			System.out.println(num1 * num2);
		} else if(operator == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("올바른 연산자가 아닙니다.");
		}
		
		switch(operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
		}
			
	}

}
