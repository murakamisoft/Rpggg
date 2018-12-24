package rpgg.chara;

import java.math.BigDecimal;

import common.NumberUtil;
import rpgg.util.Out;

public class Chara {

	private String name;
	private int hp;
	private int mp;
	private int lv;
	private int speed;
	private int attack;
	private int exp;
	private int gold;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public void damage(int damage) {
		setHp(getHp() - damage);
	}

	public boolean isDie() {
		return getHp() <= 0;
	}

	public boolean isNotDie() {
		return !isDie();
	}

	public BigDecimal getRndSpeedVal(int v) {
		BigDecimal sh = new BigDecimal(0.2);
		BigDecimal rnd = new BigDecimal(v).multiply(sh);
		rnd = NumberUtil.getRndNoBigDecimal(rnd).add(rnd);
		return new BigDecimal(getSpeed()).add(rnd);
	}

	public BigDecimal getRndAttackVal(int v) {
		BigDecimal sh = new BigDecimal(0.4);
		BigDecimal rnd = new BigDecimal(v).multiply(sh);
		rnd = NumberUtil.getRndNoBigDecimal(rnd).add(rnd);
		return new BigDecimal(getAttack()).add(rnd);
	}

	/**
	 * ステータス表示
	 * 	private String name;
	 */
	public void showStatus() {
		Out.ln("＊＊＊＊＊　ステータスHP　＊＊＊＊＊");
		Out.ln("HP : " + getHp());
		Out.ln("MP : " + getMp());
		Out.ln("LV : " + getLv());
		Out.ln("Speed : " + getSpeed());
		Out.ln("Attack : " + getAttack());
		Out.ln("Exp : " + getExp());
		Out.ln("Gold : " + getGold());
		Out.ln("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
	}
}
