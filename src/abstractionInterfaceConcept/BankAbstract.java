package abstractionInterfaceConcept;

public abstract class BankAbstract {
	//creat abstrct class by using abstract keyword
	//one abstraction method should create
	//can declare abstract methods as well as non abstract methods
	//so that partial abstraction possible

	public abstract void loan();
	
	public void credit() {
		System.out.println("Credit from Bank method");
	}
	public void debit() {
		System.out.println("Debit from Bank method");
	}
	
}
