package random.Model.Test;

import random.Model.FlipCoinAction;

public class flipCoinTest {
	
	public static void main(String[] args) {
		try {
			FlipCoinAction fpa = new FlipCoinAction();

			for (int i = 0; i < 25; i++) {
				System.out.println(fpa.flipCoinOperate());
			}
		} catch (Exception e) {
			System.out.println(e);
		}		
		
	
	}
}
