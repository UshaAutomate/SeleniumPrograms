package abstractionInterfaceConcept;

public interface BankInterface {
	
	// we can create the interface by using interface keyword
	//Here we can achieve 100% abstraction(method declaration no body}
	//By defaulut all methods are abstract here
	//we can declare only static and final varaibles
	int minBal = 500;
	
	public void funds();
	public void personalInfo();
	public default  void fixedDeposits() {
		System.out.println("FD of the Bank");
		
	}
//	public void fixedDeoposit();

}
