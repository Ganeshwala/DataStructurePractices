package Com.DS.Hash.DirectChaining;
import java.util.*;
public class DirectChaining {

	LinkedList<String>[] hashTable;
	int maxChainSize = 5;
	
	public DirectChaining(int size) {
		hashTable = new LinkedList[size];
	}
	
	//Hash Function
	/*
		we are taking word and lenght of hashTable and modulo it to find the index for word.
	*/
	public int modeASCIIFunction(String word, int hashLenght) {
		char ch[];
		ch = word.toCharArray();
		int i,sum;
		for(sum=0,i=0;i<word.length();i++) {
			//System.out.println("Char"+ch[i]);
			sum = sum + ch[i];
		}
		return sum % hashLenght;
	}
	// first it find the index for word and check it if that place is occupied or not.
	// if that index is empty then it will create new linkedList node and add it 
	// else it will directly add that value to location.
	public void insertHashTable(String word) {
		int indexOfHashTable = modeASCIIFunction(word,hashTable.length);
		if(hashTable[indexOfHashTable] == null) {
			hashTable[indexOfHashTable] = new LinkedList<String>();
		}
		hashTable[indexOfHashTable].add(word);
	}
	
	public void displayHashTable() {
		if(hashTable == null) {
			System.out.println("Hash Table does not exsit");
		}else {
			System.out.println("Hash Table");
			for(int i=0;i<hashTable.length;i++) {
				System.out.println("Index: "+i+" key is: "+hashTable[i]);
			}
		}
	}
}
