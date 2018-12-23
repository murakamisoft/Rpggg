package rpgg.battle;

import rpgg.chara.Monster;
import rpgg.chara.Yusha;
import rpgg.util.Out;

public class Battle {
	private Monster monster;
	private Yusha yusha;

	public void init(Yusha yusha) {
		this.yusha = yusha;
	}

	public void start(Monster monster) {
		this.monster = monster;
		Out.ln(monster.getName() + "が現れた！");
		while (true) {
			attack();
			if (isBreakBattleLoop()) {
				break;
			}
		}
	}

	private boolean isBreakBattleLoop() {
		return monster.isDie() || yusha.isDie();
	}

	private void attack() {
		if (yusha.isSpeedGreaterThanMonster()) {
			attackYusha();
			if (monster.isNotDie()) {
				attackMonster();
			}
			return;
		}
		if (yusha.isNotSpeedGreaterThanMonster()) {
			attackMonster();
			if (yusha.isNotDie()) {
				attackYusha();
			}
			return;
		}
	}

	private void attackYusha() {
		int damage = 0;
		Out.ln(yusha.getName() + "の攻撃！");
		damage = yusha.getAttack();
		Out.ln(yusha.getName() + "は" + monster.getName() + "に" + yusha.getAttack() + "ポイントのダメージを与えた！");
		monster.damage(damage);
		if (monster.isDie()) {
			Out.ln(monster.getName() + "をやっつけた！");
			Out.ln(monster.getExp() + "ポイントの経験値を獲得");
			Out.ln(monster.getGold() + "ゴールドを手に入れた");
			yusha.winBattle();
		}
	}

	private void attackMonster() {

		int damage = 0;
		Out.ln(monster.getName() + "の攻撃！");
		damage = monster.getAttack();
		Out.ln(monster.getName() + "は" + yusha.getName() + "に" + monster.getAttack() + "ポイントのダメージを与えた！");
		yusha.damage(damage);
		if (yusha.isDie()) {
			Out.ln(yusha.getName() + "は死んでしまった…");
			yusha.loseBattle();
		}
	}

}
