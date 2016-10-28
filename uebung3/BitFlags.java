/**
*
* @author: 
*
*/

public class BitFlags {
	private int status;

	//Konstruktor
	public BitFlags(int s){
		status = s;
	}

	public int indexChecker(int index){
		//catches wrong index input for int (32 bits):
		int fixedIndex = 0;
		if ((index < 0) || index > 31){
			System.out.print("Index is out of Range (0-31)!");
			if (index < 0)
				fixedIndex = 0;
			else
				fixedIndex = 31;
			System.out.println(" Set Index to: " + fixedIndex);
			return fixedIndex;
		}
		return index;
	}

	public boolean isSet(int index){
		boolean isSet = false;
		index = indexChecker(index);
		//moves the index position to far right position in statusCopy (don't change status):
		int statusCopy = status >> index;
		if ((statusCopy & 1) == 1) //if last position == 1 -> set isSet to true
			isSet = true;
		return isSet;
	}

	public void switchOn(int index){
		index = indexChecker(index);
		if (isSet(index) == false){
			//status += (int)Math.pow(2, index); //next 4 lines do nearly the same as Math.pow-line
			int plus = 1;
			for (int i = 0; i < index; i++){
				plus *= 2;
			}
			status += plus; //add 1 or 2 or 4 or 8...2hoch32 depending on index
		}
	}

	public void switchOff(int index){
		index = indexChecker(index);
		if (isSet(index) == true){
			//status -= (int)Math.pow(2, index); //next 4 lines do nearly the same as Math.pow-line
			int minus = 1;
			for (int i = 0; i < index; i++){
				minus *= 2;
			}
			status -= minus; //minus 1 or 2 or 4 or 8...2hoch32 depending on index
		}
	}

	public void swap(int index){
		index = indexChecker(index);
		if (isSet(index) == true){
			switchOff(index);
		}
		else{
			switchOn(index);
		}
	}

//	public String toString() {
//		String ausgabe = "\n'status' is: " + status;
//		ausgabe += "\nIn Bits:     " + Integer.toBinaryString(status) + "\n";
//		return ausgabe;
//	}

}
