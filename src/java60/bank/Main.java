package java60.bank;

public class Main {

	public static void main(String[] args) {

		Conto tony = new Conto(5465456, "Tony Stark");

		System.out.println(tony);
		System.out.println("-------------------------");

		int deposit = tony.addMoney(1500);
		System.out.println("You have deposited: " + deposit);
		System.out.println("-------------------------");

		boolean withdraw = tony.getMoney(100);
		System.out.println("You have withdrawn: " + withdraw);
		System.out.println("Your current balance is: " + tony.getBalance());

		System.out.println("-------------------------");

	}

}
