package Com.DS.Hash.DirectChaining;

public class MainDirectRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DirectChaining directChain = new DirectChaining(10);
		directChain.insertHashTable("Chintan");
		directChain.insertHashTable("Karan");
		directChain.insertHashTable("Denish");
		directChain.insertHashTable("Yash");
		directChain.insertHashTable("Manthan");
		directChain.insertHashTable("Viraj");
		directChain.insertHashTable("Akash");
		directChain.insertHashTable("Bhavya");
		directChain.insertHashTable("Dhruv");
		directChain.displayHashTable();
	}

}
