package abstractionInterfaceConcept;

public class ICICCI extends BankAbstract {

	public static void main(String[] args) {

		ICICCI i = new ICICCI();
		i.credit();
		i.debit();
		i.loan();
		i.payments();
		
	BankAbstract r	=new ICICCI();
	r.loan();
	r.credit();
	r.debit();
		
		
	}

	@Override
	public void loan() {

		System.out.println("ICICI Loan");
	}
	public void payments() {

		System.out.println("ICICI Payments");
	}

}
