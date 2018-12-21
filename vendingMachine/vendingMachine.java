// You need to design a Vending Machine which follows following requirements
// Accepts coins of 1,5,10,25, 50 Cents i.e. penny, nickel, dime, and quarter as well as 1 and 2 dollar note
// Allow user to select products e.g. CANDY(10), SNACK(50), NUTS(90), Coke(25), Pepsi(35), Soda(45)
// Allow user to take refund by canceling the request.
// Return selected product and remaining change if any
// Allow reset operation for vending machine supplier

public class vendingMachine extends products implements bank{
	
	vendingMachine{
		coinMap = new HashMap<>();
		notesMap = new HashMap<>();
	}

	public void addCoin(int value){
		coinMap.put(coinMap.getOrDefault(value, 0)+1);
		currentPurse += value/100;
	}

	public void addNotes(int value){
		notesMap.put(notesMap.getOrDefault(value, 0)+1);
		currentPurse += value;
	}

	public void refund(){
		coinMap = new HashMap<>();
		notesMap = new HashMap<>();
		currentPurse = 0;
		System.out.println("Coins refunded: balance = 0");

	}

	public void getProduct(String name){
		if (currentPurse >= productMap.get(name)){
			currentPurse -= productMap.get(name);
			System.out.println("Success");
		}
		else{
			System.out.println("Insufficient balance");
		}
	}

	// Sample Test Cases //
	public static void main(String args[]){
		vendingMachine a = new vendingMachine();
		vendingMachin.addCoin(25);
		vendingMachin.addNotes(1);
		vendingMachin.addNotes(20);
		
		vendingMachine.getProduct("candy");
		vendingMachine.getProduct("nuts");	
	}
}

