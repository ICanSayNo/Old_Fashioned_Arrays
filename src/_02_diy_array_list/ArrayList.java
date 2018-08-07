package _02_diy_array_list;

import java.lang.reflect.Array;

public class ArrayList<T>{

	T[] main = (T[]) new Object[10];
	
	public void add(T j) {
		// TODO Auto-generated method stub
		T[] usedValues = (T[]) new Object[(main.length)];
		int i = 0;
		while (main[i]!=null) {
			usedValues[i]=main[i];
			i++;
		}
		usedValues[i++]=j;
		System.out.println(j.hashCode());
		while (i<usedValues.length) {
			usedValues[i]=main[i-1];
			i++;
		}
		for (int k = 0; k < usedValues.length; k++) {
			main[k]=usedValues[k];
		}
	}

	public T get(int i) {
		// TODO Auto-generated method stub
		System.out.println(main[i]);
		return main[i];
	}

	public void set(int i, T j) {
		// TODO Auto-generated method stub
		main[i]=j;
	}

	public boolean contains(T string) {
		// TODO Auto-generated method stub
		boolean contains = false;
		for (T t : main) {
			if (t==(string)) {
				contains=true;
			}
		}
		return contains;
	}

	public void remove(int j) {
		// TODO Auto-generated method stub
		T[] usedValues = (T[]) new Object[(main.length)];
		int i = 0;
		while (i<j) {
			usedValues[i]=main[i];
			i++;
		}
		usedValues[i++]=null;
		while (i<usedValues.length) {
			usedValues[i-1]=main[i];
			i++;
		}
		for (int k = 0; k < usedValues.length; k++) {
			main[k]=usedValues[k];
		}
	}

	public void addAt(int j, T c) {
		// TODO Auto-generated method stub
		T[] usedValues = (T[]) new Object[(main.length)];
		int i = 0;
		while (i<j) {
			usedValues[i]=main[i];
			i++;
		}
		usedValues[i++]=c;
		while (i<usedValues.length) {
			usedValues[i]=main[i-1];
			i++;
		}
		for (int k = 0; k < usedValues.length; k++) {
			main[k]=usedValues[k];
		}
	}

	
}
