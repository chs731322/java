package e07_has_a;
/*
 * 군인 클래스에서는 
 * 총 정보를 모두 가지고 있어야함
 * 군인이 총쏘는 행위를 하면 총에 있는 shot 실행
 * 군인이 재장전하는 행위를 하면 총에 있는 reload 실행
 * 
 */

public class Army extends Gun {

	private Gun gun;

	public Army(Gun gun) {
		this.gun = gun;
	}
	
	public void changeGun(Gun gun) {
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
}