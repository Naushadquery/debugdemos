package com.nau;

public class Counter {
	
	private int result = 0;

	public int getResult() {
		return result;
	}

	public void count() {
		for (int i = 0; i < 100; i++) {
			result += i + 1;
		}
	}

//	@Override
//	public String toString() {
//		return "Counter [result=" + result + "]";
//	}
//	
}
