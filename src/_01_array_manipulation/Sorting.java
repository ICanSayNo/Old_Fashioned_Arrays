package _01_array_manipulation;

public class Sorting {

	public static String[] sort(String[] testArray)
    {
        int n = testArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (testArray[j] > testArray[j+1]){
                    String temp = testArray[j];
                    testArray[j] = testArray[j+1];
                    testArray[j+1] = temp;
                }
            }
        }
        return testArray;
    }
}

