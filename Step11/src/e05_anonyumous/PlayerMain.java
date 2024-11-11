package e05_anonyumous;

public class PlayerMain {
	/*
	 * 익명 클래스 (Anonymous Class)
	 * 
	 * 일회성으로 사용되는 클래스를 정의할 때 사용 
	 * 추상 클래스나 인터페이스를 확장하는 용도로 사용 
	 * 편의성, 일회성, 콜백 함수, 가독성 향상
	 */
	public static void main(String[] args) {
		Gun k2 = new Gun() {
			
			@Override
			public void shot() {
				System.out.println("K2 Shot");
			}
			
			@Override
			public void reload() {
				System.out.println("K2 Reload");
			}
		};
		
		Player player = new Player(k2);
		player.shot();
		player.setGun(new Gun() {
			
			@Override
			public void shot() {
				System.out.println("AK47 Shot");
			}
			
			@Override
			public void reload() {
				System.out.println("AK47 Reload");
			}
		});
	}
}
