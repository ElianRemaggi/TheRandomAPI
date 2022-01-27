package random.Model.Test;

import random.Model.OrAction;

public class OrTest {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 50; i++) {
				OrAction or = new OrAction(2.2, "dos punto dos");
				System.out.println(or.orOperate());
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
