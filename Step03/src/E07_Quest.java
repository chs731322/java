import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 점수를 입력받아, 다음의 기준으로 등급을 분류하여 출력하는 프로그램 작성
		 * 
		 * 95점 이상: A+ 90-94:A 85-89:B+ ..
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력하세요 >> ");
		int score = sc.nextInt();

		
		  String grade = "F";
		  
		  if (score >= 90) grade = "A"; else if (score >= 80) grade = "B"; else if
		  (score >= 70) grade = "C"; else if (score >= 60) grade = "D";
		  
		  if(score >= 60 && score % 10 >= 5) grade += "+";
		  
		  System.out.println(grade);
		 
		

		/*
		 * if (score >= 95) { System.out.println("성적은 A+입니다."); } else if (score >= 90
		 * && score < 95) { System.out.println("성적은 A입니다."); } else if (score >= 85 &&
		 * score < 90) { System.out.println("성적은 B+입니다."); } else if (score >= 80 &&
		 * score < 85) { System.out.println("성적은 B입니다."); } else if (score >= 75 &&
		 * score < 80) { System.out.println("성적은 C+입니다."); } else if (score >= 70 &&
		 * score < 75) { System.out.println("성적은 C입니다."); } else if (score >= 65 &&
		 * score < 70) { System.out.println("성적은 D+입니다."); } else if (score >= 60 &&
		 * score < 65) { System.out.println("성적은 D입니다."); } else {
		 * System.out.println("성적은 F입니다."); }
		 */
	}

}
