package random.Model.Test;

import random.Model.DiceAction;

public class DiceActionTest {
	public static void main(String[] args) {
		rollsTest();
	}

	public static void rollTest() {
		try {
			DiceAction dice;
			for (int i = 0; i < 50; i++) {
				dice = new DiceAction();
				int f = dice.roll();
				System.out.println(f);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void rollsTest() {
		try {
			DiceAction dice = new DiceAction(10);
			int arrayResult[] = dice.rolls();
			System.out.println("Lanzamos " + arrayResult.length + " dados");
			for (int x : arrayResult) {
				System.out.println(x);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
