package abstractionInterfaceConcept;

public class HDFCBank extends BankAbstract {

	public static void main(String[] args) {
		
		HDFCBank h = new HDFCBank();
		h.interst();
		h.loan();
		h.credit();
		h.debit();

		BankAbstract b = new HDFCBank();
		
		b.credit();
		b.debit();
		b.loan();
		//can not call b.interst coz b refrring to parent class and
		//parent class cant access child methods.
		// its called dynamic polymorphism
		
	
	}

	@Override
	public void loan() {

		System.out.println("HDFC Loan");
		
	}
	
	public void interst() {
		System.out.println("HDFC Interest");
	}

}
