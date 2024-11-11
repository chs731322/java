

/*
 * 사원 정보를 저장할 클래스를 작성해서 사원 정보 한 건을 저장 후 출력

저장할 정보 : 사원 번호, 직급명, 부서명, 연봉, 성별

출력 형태
20101111 김철수(남) 부장 총무부 7800
 */
public class Employee {

      
      String employeeNo;   //사원번호
      String employeeName;//이름
      String employeePos;   //직급
      String employeeDep;   //부서
      int income;         //연봉
      boolean gender;      //성별
      
      void printInfo() {
         if(gender == true)
            System.out.println(employeeNo + " " + employeeName + "(남) " + employeePos +" "+ employeeDep +" "+ income);
         else
            System.out.println(employeeNo + " " + employeeName + "(여) " + employeePos +" "+ employeeDep +" "+ income);
      }
         
      void init(String no, String name, String pos, String dep, int i, boolean g) {
         //학생데이터 초기화
         employeeNo = no;
         employeeName= name;
         employeePos = pos;
         employeeDep = dep;
         income = i;
         gender = g;
   }

}