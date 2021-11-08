package Com.DS.Hash.DirectChaining;
import java.util.*;
public class DirectChaining {

	LinkedList<String>[] hashTable;
	int maxChainSize = 5;
	
	public DirectChaining(int size) {
		hashTable = new LinkedList[size];
	}
	
	//Hash Function
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
