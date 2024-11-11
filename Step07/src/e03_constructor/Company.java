package e03_constructor;

public class Company {
	String companyName;
	String companyTel;
	int employeeCount;
	String companyURL;
	
	public Company(String companyName, String companyTel, int employeeCount, String companyURL) {
		this.companyName = companyName;
		this.companyTel = companyTel;
		this.employeeCount = employeeCount;
		this.companyURL = companyURL;
	}

	public Company(String companyName, String companyTel) {
		this(companyName, companyTel, 100, "https://test.com");
	}

	//단축키 : Alt + Shift + S
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyTel=" + companyTel + ", employeeCount=" + employeeCount
				+ ", companyURL=" + companyURL + "]";
	}
	
	
}
