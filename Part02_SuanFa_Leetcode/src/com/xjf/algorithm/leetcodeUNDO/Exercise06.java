package com.xjf.algorithm.leetcodeUNDO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.util.Pair;

//Ì«ÂýÁË
public class Exercise06 {

	public static void main(String[] args) {
		String convert = convert("PAYPALISHIRING", 4);
		System.out.println(convert);
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		String result = "";
		List<Pair<Character, Integer>> list = new ArrayList<>();
		int unit = (numRows - 1) * 2;

		for (int i = 0; i < s.length(); i++) {
			if (i % unit < numRows) {
				list.add(new Pair<Character, Integer>(s.charAt(i), i % unit));
			} else {
				list.add(new Pair<Character, Integer>(s.charAt(i), 2 * numRows - 2 - i % unit));
			}
		}

//		for (int i = 0; i < numRows; i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if(list.get(j).getValue()==i) {
//					result = result+list.get(j).getKey();
//				}
//			}
//		}
		for (int i = 0; i < numRows; i++) {
			Iterator<Pair<Character, Integer>> it = list.iterator();
			while(it.hasNext()) {
				Pair<Character,Integer> pair = it.next();
				if (pair.getValue() == i) {
					result = result + pair.getKey();
					it.remove();
				}
			}
			
		}
		return result;
	}
}
