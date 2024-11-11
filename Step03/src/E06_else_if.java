
public class E06_else_if {

	public static void main(String[] args) {

		/*
		 * 
		 * 		else if
		 * 			if문으로 구성된 조건문에서 두 번째 조건문부터 담당하는 문법
		 * 
		 * 		if(조건식) {
		 * 			실행 코드
		 * 			..
		 * 		} else if(조건식2) {
		 * 			실행 코드
		 * 			..
		 * 		} else {
		 * 			실행 코드
		 * 		}
		 */
		
		//성인 20세 이상, 고등학생 17-19, 중학생 14-16, 초등학생 8-13, 미취학아동
		int age = 18;
		/*
		 * if(age >= 20) { System.out.println("성인"); } else if (age>=17 && age <20) {
		 * System.out.println("고등학생"); } else if (age >= 14 && age < 17) {
		 * System.out.println("중학생"); } else if (age >=8 && age <13) {
		 * System.out.println("초등학생"); } else { System.out.println("미취학 아동"); }
		 */
		if(age < 8) {
			System.out.println("미취학 아동");
		} else if (age >= 8 && age < 13) {
			System.out.println("초등학생");
		} else if (age >= 14 && age < 17) {
			System.out.println("중학생");
		} else if (age>=17 && age <20) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}

}
