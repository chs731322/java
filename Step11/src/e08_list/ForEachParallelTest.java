package e08_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachParallelTest {
	 public static void main(String[] args) {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		// 샘플 데이터 10건 리스트에 추가
		
		list.add(new StudentDTO("20230001", "김철수", "컴퓨터공학", 2.8));
        list.add(new StudentDTO("20230002", "이영희", "경영학", 3.5));
        list.add(new StudentDTO("20230003", "박민수", "전기공학", 4.0));
        list.add(new StudentDTO("20230004", "최지혜", "심리학", 3.7));
        list.add(new StudentDTO("20230005", "홍길동", "수학", 3.9));
        list.add(new StudentDTO("20230006", "강준호", "물리학", 2.6));
        list.add(new StudentDTO("20230007", "윤서연", "화학", 3.4));
        list.add(new StudentDTO("20230008", "오정훈", "철학", 1.4));
        list.add(new StudentDTO("20230009", "서민지", "영문학", 3.3));
        list.add(new StudentDTO("20230010", "장민호", "경제학", 3.9));

        // 학생 정보 출력
//        for (StudentDTO student : list) student.printInfo();
        
//        //forEach, Consumer 익명 클래스로 작성
//        list.forEach(new Consumer<StudentDTO>() {
//
//			@Override
//			public void accept(StudentDTO t) {
//				t.printInfo();
//			}
//        	
//		});
        
        // forEach, 람다식으로 적용하여 작성
        list.forEach(t -> t.printInfo());
        
        // 학생 전체 평점의 평균을 출력
        double avg = 0.0;
        ArrayList<Double> scoreList = new ArrayList<Double>();
        list.forEach(t -> scoreList.add(t.getScore()));
        // acc : 누적된 값 (리턴되어 받은 값), cur : 현재 데이터
        // 리스트에 있는 값을 계산해서 리턴
        avg = scoreList.parallelStream().reduce(0.0, (acc, cur) -> acc + cur);
        avg /= list.size();
        System.out.println("전체 학생 평균 : " + avg);
        
        // 평점이 제일 높은 학생 정보를 출력
//        StudentDTO max = list.get(0);
//        for(StudentDTO dto : list) {
//        	if(max.getScore() < dto.getScore())
//        		max = dto;
//        }
        StudentDTO max = 
        		list.parallelStream().reduce(list.get(0), (acc, cur) -> acc.getScore() < cur.getScore() ? cur : acc);
        max.printInfo();
        
        System.out.println("==========================================");
        // 평점이 3.0 이상인 학생 정보를 출력
//        for (StudentDTO dto : list) {
//        	if(dto.getScore() >= 3.0)
//        		dto.printInfo();
//        }
        List<StudentDTO> filterList = list.parallelStream().filter(t -> t.getScore() >= 3.0).toList();
        filterList.forEach(t -> t.printInfo());
	}
}
