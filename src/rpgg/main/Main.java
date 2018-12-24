package rpgg.main;

import rpgg.exception.YushaDieException;
import rpgg.util.Out;

/**
 * メイン
 *
 * @author admin
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello RPG!");
		GameMng gameMng = new GameMng();
		try {
			gameMng.execute();
		} catch (YushaDieException e) {
			Out.ln("ゲームオーバー");
		}
	}

}
