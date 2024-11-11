package e03_constructor;

public class CompanyMain {

	public static void main(String[] args) {
		Company c1 = new Company("철강소", "02-3333-4444", 300, "https://aaaa.gg");
		Company c2 = new Company("목공소", "02-1111-4444");
		
		System.out.println(c1);
		System.out.println(c2);
	}

}