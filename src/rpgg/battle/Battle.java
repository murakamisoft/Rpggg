package rpgg.battle;

import rpgg.chara.Monster;
import rpgg.chara.Yusha;
import rpgg.exception.YushaDieException;
import rpgg.util.Out;

public class Battle {
	private Monster monster;
	private Yusha yusha;

	public void init(Yusha yusha) {
		this.yusha = yusha;
	}

	public void start(Monster monster) throws YushaDieException {
		this.monster = monster;
		Out.ln(monster.getName() + "が現れた！");
		while (true) {
			attack();
			if (monster.isDie()) {
				break;
			}
		}
	}

	private void attack() throws YushaDieException {
		if (yusha.isSpeedGreaterThanMonster()) {
			attackYusha();
			if (monster.isNotDie()) {
				attackMonster();
			}
		} else {
			attackMonster();
			if (yusha.isNotDie()) {
				attackYusha();
			}
		}
	}

	private void attackYusha() {
		int damage = 0;
		Out.ln(yusha.getName() + "の攻撃！");
		damage = yusha.getRndAttackVal(yusha.getAttack()).intValue();
		Out.ln(yusha.getName() + "は" + monster.getName() + "に" + damage + "ポイントのダメージを与えた！");
		monster.damage(damage);
		if (monster.isDie()) {
			Out.ln(monster.getName() + "をやっつけた！");
			Out.ln(monster.getExp() + "ポイントの経験値を獲得");
			Out.ln(monster.getGold() + "ゴールドを手に入れた");
			yusha.winBattle();
		}
	}

	private void attackMonster() throws YushaDieException {

		int damage = 0;
		Out.ln(monster.getName() + "の攻撃！");
		damage = monster.getRndAttackVal(monster.getAttack()).intValue();
		Out.ln(monster.getName() + "は" + yusha.getName() + "に" + damage + "ポイントのダメージを与えた！");
		yusha.damage(damage);
		if (yusha.isDie()) {
			Out.ln(yusha.getName() + "は死んでしまった…");
			yusha.loseBattle();
			throw new YushaDieException();
		}
	}

}
