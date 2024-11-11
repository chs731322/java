package e06_has_a;
/*
 * 군인 클래스에서는 
 * 총 정보를 모두 가지고 있어야함
 * 군인이 총쏘는 행위를 하면 총에 있는 shot 실행
 * 군인이 재장전하는 행위를 하면 총에 있는 reload 실행
 * 
 * PlayerMain 클래스를 만들어서 Player 생성해서 shot과 reload를 테스트
 *  
 *  객체와 객체의 Has a 관계를 상속구조로 표현하게되면 문제가 발생
 *  플레이어의 경우 다양한 총기를 교체해야되는데, 상속으로 표현하면 총기하나에 귀속, 확장성이 떨어짐
 *  총기 교환을 할려면 코드를 수정해야되는 문제가 생김
 *  이런 문제 때문에 Has a 관계를 표현할 때는 상속 구조로 표현하면 안됨
 */
public class Army extends Gun {

	// 군인이 총쏘는 행위
	@Override
	public void shot() {
		super.shot();
	}

	// 군인이 재장전하는 행위
	@Override
	public void reload() {
		super.reload();
	}
	
}
