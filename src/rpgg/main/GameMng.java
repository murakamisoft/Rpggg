package rpgg.main;

import rpgg.battle.Battle;
import rpgg.chara.Monster;
import rpgg.chara.Yusha;
import rpgg.field.Field;
import rpgg.town.Town;

public class GameMng {

	Town town = new Town();
	Yusha yusha = new Yusha();
	Field field = new Field();
	Battle battle = new Battle();
	Monster monster = new Monster();

	public void execute() {
		while (true) {
			init();
			yusha.selectNextAction();
			switch (yusha.getNextAction()) {
			case "0"://フィールドに出る
				battle.start(monster);
				yusha.showStatus();
				break;
			case "9"://終了
				return;
			default:
			}

		}
	}

	private void init() {
		monster.init();
		yusha.init();
		yusha.setMonster(monster);
		battle.init(yusha);
		field.start();
	}

}
