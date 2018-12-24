package rpgg.chara;

import java.math.BigDecimal;

import common.NumberUtil;
import rpgg.status.StatusMng;

public class Yusha extends Chara {

	/** モンスター　*/
	private Monster monster;

	/** 現在位置 */
	private String position;

	private String nextAction;

	private StatusMng statusMng;

	/**
	 * 初期化
	 */
	public void init() {
		statusMng = new StatusMng();
		setHp(20);
		setMp(0);
		setLv(1);
		setName("勇者");
		setSpeed(4);
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
		BigDecimal ys = getRndSpeedVal(getSpeed());
		BigDecimal ms = getRndSpeedVal(monster.getSpeed());
		return NumberUtil.isGreater(ys, ms);
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
		//		while (true) {
		//			Out.ln("次のアクションを選択してください");
		//			Out.ln("0 : フィールドに出る");
		//			Out.ln("9 : 終了");
		//			String next = Scan.scan();
		//			if ("0".equals(next) || "9".equals(next)) {
		//				setNextAction(next);
		//				break;
		//			}
		//		}
		setNextAction("0");
	}

	public boolean isLvUp() {
		if (getExp() >= statusMng.getExp(getLv())) {
			return true;
		}
		return false;
	}

	public void lvUp() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
