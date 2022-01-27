package random.Model.Test;

import random.Model.RockPaperScissorsAction;

public class RockPaperScissorsActionTest {
	public static void main(String[] args) {

		PlayRockPaperScissorsActionTest();

	}

	private static void PlayRockPaperScissorsActionTest() {
		try {
			RockPaperScissorsAction rpcat = new RockPaperScissorsAction();

			for (int i = 0; i < 25; i++) {
				System.out.println(rpcat.playRockPaperScissorsAction());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
