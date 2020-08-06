
package com.prateek.constant;

public enum Numeral {
	ZERO(0);

	int num;

	Numeral(final int num){
		this.num=num;
	}

	/**
	 * @return the value of num
	 */
	public int getNum() {
		return num;
	}
}