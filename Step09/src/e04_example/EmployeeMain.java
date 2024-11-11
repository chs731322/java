package e04_example;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		
		PermantWorker p = new PermantWorker(7200, "김철수");
		//p.printInfo();
		PartTimeWorker p2 = new PartTimeWorker("김현오", 800, 10000);
		//p2.printInfo();
		ForeignWorker f = new ForeignWorker(6000, "조해솔", 2);
		//f.printInfo();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(p);
		list.add(p2);
		list.add(f);
		list.add(new ForeignWorker(3600, "김영수", 1));
		
		//반복문 - 모든 직원의 정보를 출력
		for(Employee std : list)
			std.printInfo();
		
		//전체 지출되는 연봉 금액 출력
		int result = 0;
		for(Employee std : list) 
			result += std.getPay();
		System.out.println("전체 지출되는 급여 : " + result);
	}

}