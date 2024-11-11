package e06_has_a;

public class ArmyMain {

	public static void main(String[] args) {
		Army army = new Army();
		
		for(int i = 0; i < 50; i++)
			army.shot();
		army.reload();
	}

}
