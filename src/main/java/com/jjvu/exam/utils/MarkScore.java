package com.jjvu.exam.utils;

import com.jjvu.exam.po.X1;
import com.jjvu.exam.po.X2;
import com.jjvu.exam.po.X3;
import com.jjvu.exam.po.Y1;
import com.jjvu.exam.po.Y2;
import com.jjvu.exam.po.Y3;

/**
 * 打分
 * 
 * @author SongM
 * @date 2017年11月29日 下午9:21:10
 */
public class MarkScore {

	/**
	 * 单选题打分
	 * @param x1
	 * @param y1
	 * @return
	 */
	public static int sum1(X1 x1, Y1 y1) {
		int count = 0;
		if (x1.getX1_1().equals(y1.getY1_1())) {
			count++;
		}
		if (x1.getX1_2().equals(y1.getY1_2())) {
			count++;
		}
		if (x1.getX1_3().equals(y1.getY1_3())) {
			count++;
		}
		if (x1.getX1_4().equals(y1.getY1_4())) {
			count++;
		}
		if (x1.getX1_5().equals(y1.getY1_5())) {
			count++;
		}
		if (x1.getX1_6().equals(y1.getY1_6())) {
			count++;
		}
		if (x1.getX1_7().equals(y1.getY1_7())) {
			count++;
		}
		if (x1.getX1_8().equals(y1.getY1_8())) {
			count++;
		}
		if (x1.getX1_9().equals(y1.getY1_9())) {
			count++;
		}
		if (x1.getX1_10().equals(y1.getY1_10())) {
			count++;
		}
		if (x1.getX1_11().equals(y1.getY1_11())) {
			count++;
		}
		if (x1.getX1_12().equals(y1.getY1_12())) {
			count++;
		}
		if (x1.getX1_13().equals(y1.getY1_13())) {
			count++;
		}
		if (x1.getX1_14().equals(y1.getY1_14())) {
			count++;
		}
		if (x1.getX1_15().equals(y1.getY1_15())) {
			count++;
		}
		if (x1.getX1_16().equals(y1.getY1_16())) {
			count++;
		}
		if (x1.getX1_17().equals(y1.getY1_17())) {
			count++;
		}
		if (x1.getX1_18().equals(y1.getY1_18())) {
			count++;
		}
		if (x1.getX1_19().equals(y1.getY1_19())) {
			count++;
		}
		if (x1.getX1_20().equals(y1.getY1_20())) {
			count++;
		}
		if (x1.getX1_21().equals(y1.getY1_21())) {
			count++;
		}
		if (x1.getX1_22().equals(y1.getY1_22())) {
			count++;
		}
		if (x1.getX1_23().equals(y1.getY1_23())) {
			count++;
		}
		if (x1.getX1_24().equals(y1.getY1_24())) {
			count++;
		}
		if (x1.getX1_25().equals(y1.getY1_25())) {
			count++;
		}
		if (x1.getX1_26().equals(y1.getY1_26())) {
			count++;
		}
		if (x1.getX1_27().equals(y1.getY1_27())) {
			count++;
		}
		if (x1.getX1_28().equals(y1.getY1_28())) {
			count++;
		}
		if (x1.getX1_29().equals(y1.getY1_29())) {
			count++;
		}
		if (x1.getX1_30().equals(y1.getY1_30())) {
			count++;
		}
		if (x1.getX1_31().equals(y1.getY1_31())) {
			count++;
		}
		if (x1.getX1_32().equals(y1.getY1_32())) {
			count++;
		}
		if (x1.getX1_33().equals(y1.getY1_33())) {
			count++;
		}
		if (x1.getX1_34().equals(y1.getY1_34())) {
			count++;
		}
		if (x1.getX1_35().equals(y1.getY1_35())) {
			count++;
		}
		if (x1.getX1_36().equals(y1.getY1_36())) {
			count++;
		}
		if (x1.getX1_37().equals(y1.getY1_37())) {
			count++;
		}
		if (x1.getX1_38().equals(y1.getY1_38())) {
			count++;
		}
		if (x1.getX1_39().equals(y1.getY1_39())) {
			count++;
		}
		if (x1.getX1_40().equals(y1.getY1_40())) {
			count++;
		}
		if (x1.getX1_41().equals(y1.getY1_41())) {
			count++;
		}
		if (x1.getX1_42().equals(y1.getY1_42())) {
			count++;
		}
		if (x1.getX1_43().equals(y1.getY1_43())) {
			count++;
		}
		if (x1.getX1_44().equals(y1.getY1_44())) {
			count++;
		}
		if (x1.getX1_45().equals(y1.getY1_45())) {
			count++;
		}
		return count;
	}

	/**
	 * 多选题打分
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static int sum2(X2 x2, Y2 y2) {
		int count = 20;
		if (y2.getY2_46().length() == x2.getX2_46().length()) {
			String[] split = x2.getX2_46().split(",");
			for (String str : split) {
				if (y2.getY2_46().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_47().length() == x2.getX2_47().length()) {
			String[] split = x2.getX2_47().split(",");
			for (String str : split) {
				if (y2.getY2_47().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_48().length() == x2.getX2_48().length()) {
			String[] split = x2.getX2_48().split(",");
			for (String str : split) {
				if (y2.getY2_48().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_49().length() == x2.getX2_49().length()) {
			String[] split = x2.getX2_49().split(",");
			for (String str : split) {
				if (y2.getY2_49().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_50().length() == x2.getX2_50().length()) {
			String[] split = x2.getX2_50().split(",");
			for (String str : split) {
				if (y2.getY2_50().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_51().length() == x2.getX2_51().length()) {
			String[] split = x2.getX2_51().split(",");
			for (String str : split) {
				if (y2.getY2_51().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_52().length() == x2.getX2_52().length()) {
			String[] split = x2.getX2_52().split(",");
			for (String str : split) {
				if (y2.getY2_52().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_53().length() == x2.getX2_53().length()) {
			String[] split = x2.getX2_53().split(",");
			for (String str : split) {
				if (y2.getY2_53().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_54().length() == x2.getX2_54().length()) {
			String[] split = x2.getX2_54().split(",");
			for (String str : split) {
				if (y2.getY2_54().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_55().length() == x2.getX2_55().length()) {
			String[] split = x2.getX2_55().split(",");
			for (String str : split) {
				if (y2.getY2_55().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_56().length() == x2.getX2_56().length()) {
			String[] split = x2.getX2_56().split(",");
			for (String str : split) {
				if (y2.getY2_56().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_57().length() == x2.getX2_57().length()) {
			String[] split = x2.getX2_57().split(",");
			for (String str : split) {
				if (y2.getY2_57().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_58().length() == x2.getX2_58().length()) {
			String[] split = x2.getX2_58().split(",");
			for (String str : split) {
				if (y2.getY2_58().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_59().length() == x2.getX2_59().length()) {
			String[] split = x2.getX2_59().split(",");
			for (String str : split) {
				if (y2.getY2_59().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_60().length() == x2.getX2_60().length()) {
			String[] split = x2.getX2_60().split(",");
			for (String str : split) {
				if (y2.getY2_60().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_61().length() == x2.getX2_61().length()) {
			String[] split = x2.getX2_61().split(",");
			for (String str : split) {
				if (y2.getY2_61().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_62().length() == x2.getX2_62().length()) {
			String[] split = x2.getX2_62().split(",");
			for (String str : split) {
				if (y2.getY2_62().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_63().length() == x2.getX2_63().length()) {
			String[] split = x2.getX2_63().split(",");
			for (String str : split) {
				if (y2.getY2_63().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_64().length() == x2.getX2_64().length()) {
			String[] split = x2.getX2_64().split(",");
			for (String str : split) {
				if (y2.getY2_64().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		if (y2.getY2_65().length() == x2.getX2_65().length()) {
			String[] split = x2.getX2_65().split(",");
			for (String str : split) {
				if (y2.getY2_65().indexOf(str) == -1) {
					count--;
					break;
				}
			}
		} else {
			count--;
		}
		return count;
	}

	/**
	 * 判断题打分
	 * @param x3
	 * @param y3
	 * @return
	 */
	public static int sum3(X3 x3, Y3 y3) {
		int count = 0;
		if (x3.getX3_66() == y3.getY3_66()) {
			count++;
		}
		if (x3.getX3_67() == y3.getY3_67()) {
			count++;
		}
		if (x3.getX3_68() == y3.getY3_68()) {
			count++;
		}
		if (x3.getX3_69() == y3.getY3_69()) {
			count++;
		}
		if (x3.getX3_70() == y3.getY3_70()) {
			count++;
		}
		if (x3.getX3_71() == y3.getY3_71()) {
			count++;
		}
		if (x3.getX3_72() == y3.getY3_72()) {
			count++;
		}
		if (x3.getX3_73() == y3.getY3_73()) {
			count++;
		}
		if (x3.getX3_74() == y3.getY3_74()) {
			count++;
		}
		if (x3.getX3_75() == y3.getY3_75()) {
			count++;
		}
		if (x3.getX3_76() == y3.getY3_76()) {
			count++;
		}
		if (x3.getX3_77() == y3.getY3_77()) {
			count++;
		}
		if (x3.getX3_78() == y3.getY3_78()) {
			count++;
		}
		if (x3.getX3_79() == y3.getY3_79()) {
			count++;
		}
		if (x3.getX3_80() == y3.getY3_80()) {
			count++;
		}
		if (x3.getX3_81() == y3.getY3_81()) {
			count++;
		}
		if (x3.getX3_82() == y3.getY3_82()) {
			count++;
		}
		if (x3.getX3_83() == y3.getY3_83()) {
			count++;
		}
		if (x3.getX3_84() == y3.getY3_84()) {
			count++;
		}
		if (x3.getX3_85() == y3.getY3_85()) {
			count++;
		}
		if (x3.getX3_86() == y3.getY3_86()) {
			count++;
		}
		if (x3.getX3_87() == y3.getY3_87()) {
			count++;
		}
		if (x3.getX3_88() == y3.getY3_88()) {
			count++;
		}
		if (x3.getX3_89() == y3.getY3_89()) {
			count++;
		}
		if (x3.getX3_90() == y3.getY3_90()) {
			count++;
		}
		if (x3.getX3_91() == y3.getY3_91()) {
			count++;
		}
		if (x3.getX3_92() == y3.getY3_92()) {
			count++;
		}
		if (x3.getX3_93() == y3.getY3_93()) {
			count++;
		}
		if (x3.getX3_94() == y3.getY3_94()) {
			count++;
		}
		if (x3.getX3_95() == y3.getY3_95()) {
			count++;
		}
		if (x3.getX3_96() == y3.getY3_96()) {
			count++;
		}
		if (x3.getX3_97() == y3.getY3_97()) {
			count++;
		}
		if (x3.getX3_98() == y3.getY3_98()) {
			count++;
		}
		if (x3.getX3_99() == y3.getY3_99()) {
			count++;
		}
		if (x3.getX3_100() == y3.getY3_100()) {
			count++;
		}
		return count;
	}

}
