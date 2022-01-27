package random.Model.Test;

import random.Model.*;

public class RangeTest {

	public static void main(String[] args) {

		calculateRangeTest();

	}

	public static void calculateRangeTest() {
		try {
			RangeAction range;
			for (int i = 0; i < 200; i++) {
				range = new RangeAction();// Para especificar un rango usar dos parametros en formato entero
											// RangeAction(10,15);
				int f = range.calculateRange();
				System.out.println(f);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
