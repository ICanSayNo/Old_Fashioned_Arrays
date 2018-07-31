package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		int[] usedValues = new int[(testArray.length+1)];
		boolean valueAdded = false;

		for (int j2 = 0; j2 < usedValues.length; j2++) {
			if(j2==i) {
				usedValues[j2]=j;
				j2+=1;
				valueAdded=true;
			}
			if(valueAdded) {
				usedValues[j2]=testArray[j2-1];
			}
			else if(!valueAdded) {
				usedValues[j2]=testArray[j2];
			}
		}
		
		return usedValues;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String newString) {
		String[] usedValues = new String[(orderedArray.length+1)];
		int i = 0;
		while (i<orderedArray.length&&newString.compareTo(orderedArray[i])>0) {
			usedValues[i]=orderedArray[i];
			i++;
		}
		usedValues[i++]=newString;
		while (i<usedValues.length) {
			usedValues[i]=orderedArray[i-1];
			i++;
		}
		return usedValues;
		}
	}
	
