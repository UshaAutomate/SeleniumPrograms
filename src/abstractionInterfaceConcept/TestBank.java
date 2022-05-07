package abstractionInterfaceConcept;

public class TestBank implements BankInterface {

	public static void main(String[] args) {

		TestBank t = new TestBank();
		t.personalInfo();
		t.funds();
		t.openAccount();
		
		BankInterface n = new TestBank();
		n.funds();
		n.personalInfo();
		n.fixedDeposits();
		

	}

	@Override
	public void funds() {

	
		System.out.println("My TestBank Funds");
	}

	@Override
	public void personalInfo() {

		System.out.println("ntBaPersonal Information");

	}

	public void openAccount() {
		System.out.println("Minimum balance should be " +minBal);

		
	}
}
