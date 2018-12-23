package rpgg.chara;

import rpgg.util.Out;
import rpgg.util.Scan;

public class Yusha extends Chara {

	/** モンスター　*/
	private Monster monster;

	/** 現在位置 */
	private String position;

	private String nextAction;

	/**
	 * 初期化
	 */
	public void init() {
		setHp(20);
		setMp(0);
		setLv(1);
		setName("勇者");
		setSpeed(6);
		setAttack(10);
	}

	public Monster getMonster() {
		return monster;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNextAction() {
		return nextAction;
	}

	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	/**
	 * モンスターのスピードより素早いか
	 * @return
	 */
	public boolean isSpeedGreaterThanMonster() {
		return getSpeed() >= monster.getSpeed();
	}

	/**
	 * モンスターのスピードより遅いか
	 * @return
	 */
	public boolean isNotSpeedGreaterThanMonster() {
		return !this.isSpeedGreaterThanMonster();
	}

	/**
	 * 死んでしまった
	 */
	public void loseBattle() {
		toHalfGold();
	}

	private void toHalfGold() {
		setGold(getGold() / 2);
	}

	public void winBattle() {
		setExp(getExp() + monster.getExp());
		setGold(getGold() + monster.getGold());
	}

	public void selectNextAction() {
		while (true) {
			Out.ln("次のアクションを選択してください");
			Out.ln("0 : フィールドに出る");
			Out.ln("9 : 終了");
			String next = Scan.scan();
			if ("0".equals(next) || "9".equals(next)) {
				setNextAction(next);
				break;
			}
		}
	}
}
