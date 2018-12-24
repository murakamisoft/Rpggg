package rpgg.status;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatusMng {

	private List<LvExp> lvExpList;

	public StatusMng() {
		lvExpList = new ArrayList<LvExp>();
		LvExp lvExp = new LvExp();
		lvExp.setLv(1);
		lvExp.setExp(0);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(2);
		lvExp.setExp(29);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(3);
		lvExp.setExp(87);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(4);
		lvExp.setExp(174);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(5);
		lvExp.setExp(304);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(6);
		lvExp.setExp(499);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(7);
		lvExp.setExp(792);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(8);
		lvExp.setExp(1232);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(9);
		lvExp.setExp(1891);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(10);
		lvExp.setExp(2880);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(11);
		lvExp.setExp(4364);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(12);
		lvExp.setExp(6218);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(13);
		lvExp.setExp(8534);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(14);
		lvExp.setExp(11428);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(15);
		lvExp.setExp(15045);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(16);
		lvExp.setExp(19114);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(17);
		lvExp.setExp(23690);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(18);
		lvExp.setExp(28837);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(19);
		lvExp.setExp(34627);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(20);
		lvExp.setExp(41141);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(21);
		lvExp.setExp(48468);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(22);
		lvExp.setExp(56711);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(23);
		lvExp.setExp(65983);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(24);
		lvExp.setExp(76413);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(25);
		lvExp.setExp(88147);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(26);
		lvExp.setExp(101347);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(27);
		lvExp.setExp(116196);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(28);
		lvExp.setExp(132901);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(29);
		lvExp.setExp(151694);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(30);
		lvExp.setExp(172836);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(31);
		lvExp.setExp(196621);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(32);
		lvExp.setExp(223378);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(33);
		lvExp.setExp(253480);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(34);
		lvExp.setExp(287344);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(35);
		lvExp.setExp(325440);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(36);
		lvExp.setExp(368298);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(37);
		lvExp.setExp(416512);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(38);
		lvExp.setExp(470752);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(39);
		lvExp.setExp(531771);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(40);
		lvExp.setExp(600417);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(41);
		lvExp.setExp(677644);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(42);
		lvExp.setExp(764524);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(43);
		lvExp.setExp(862263);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(44);
		lvExp.setExp(960002);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(45);
		lvExp.setExp(1057741);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(46);
		lvExp.setExp(1155480);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(47);
		lvExp.setExp(1253219);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(48);
		lvExp.setExp(1350958);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(49);
		lvExp.setExp(1448697);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(50);
		lvExp.setExp(1546436);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(51);
		lvExp.setExp(1644175);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(52);
		lvExp.setExp(1741914);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(53);
		lvExp.setExp(1839653);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(54);
		lvExp.setExp(1937392);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(55);
		lvExp.setExp(2035131);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(56);
		lvExp.setExp(2132870);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(57);
		lvExp.setExp(2230609);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(58);
		lvExp.setExp(2328348);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(59);
		lvExp.setExp(2426087);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(60);
		lvExp.setExp(2523826);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(61);
		lvExp.setExp(2621565);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(62);
		lvExp.setExp(2719304);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(63);
		lvExp.setExp(2817043);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(64);
		lvExp.setExp(2914782);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(65);
		lvExp.setExp(3012521);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(66);
		lvExp.setExp(3110260);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(67);
		lvExp.setExp(3207999);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(68);
		lvExp.setExp(3305738);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(69);
		lvExp.setExp(3403477);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(70);
		lvExp.setExp(3501216);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(71);
		lvExp.setExp(3598915);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(72);
		lvExp.setExp(3696694);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(73);
		lvExp.setExp(3794433);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(74);
		lvExp.setExp(3892172);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(75);
		lvExp.setExp(3989911);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(76);
		lvExp.setExp(4087650);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(77);
		lvExp.setExp(4185389);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(78);
		lvExp.setExp(4283128);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(79);
		lvExp.setExp(4380867);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(80);
		lvExp.setExp(4478606);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(81);
		lvExp.setExp(4576345);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(82);
		lvExp.setExp(4674084);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(83);
		lvExp.setExp(4771823);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(84);
		lvExp.setExp(4869562);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(85);
		lvExp.setExp(4967301);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(86);
		lvExp.setExp(5065040);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(87);
		lvExp.setExp(5162779);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(88);
		lvExp.setExp(5260518);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(89);
		lvExp.setExp(5358257);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(90);
		lvExp.setExp(5455996);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(91);
		lvExp.setExp(5553735);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(92);
		lvExp.setExp(5651474);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(93);
		lvExp.setExp(5749213);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(94);
		lvExp.setExp(5846952);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(95);
		lvExp.setExp(5944691);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(96);
		lvExp.setExp(6042430);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(97);
		lvExp.setExp(6140169);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(98);
		lvExp.setExp(6237908);
		lvExpList.add(lvExp);
		lvExp = new LvExp();
		lvExp.setLv(99);
		lvExp.setExp(6335647);
		lvExpList.add(lvExp);
		lvExp = new LvExp();

	}

	public int getExp(int lv) {
		List<LvExp> lvExp = this.lvExpList.stream().filter(l -> l.getLv() == lv).collect(Collectors.toList());
		return lvExp.get(0).getExp();
	}
}