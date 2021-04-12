package com.xjf.newcoder.exam10;

import java.util.HashMap;
import java.util.Map;


//TODO Ê±¼ä¸´ÔÓ¶È
public class Exercise03 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int cnt = scanner.nextInt();
//		while (cnt > 0) {
//			int seatLength = scanner.nextInt();
//			scanner.nextLine();
//			StringBuffer seatCondition = new StringBuffer(scanner.nextLine());
//			int waitLength = Integer.valueOf(scanner.nextLine());
//			String sexs = scanner.nextLine();
//			whereToSit(seatLength, seatCondition, waitLength, sexs);
//			cnt--;
//		}

		whereToSit(50, new StringBuffer("10010010112020001012010100010120020111011010000000"), 73, "FFFMMFMFFMFMFFMMMMFFMMFMMFFMMMFMMMMMFFFMFMMFMFFMMFMMMFMFFMFFMMMMFMFFMFFMM");

	}

	public static Map<Character,Integer> map = new HashMap<>();
	public static void whereToSit(int seatLength, StringBuffer seatCondition, int waitLength, String sexs) {
		for (int i = 0; i < seatCondition.length(); i++) {
			if(map.get(seatCondition.charAt(i))==null||map.get(seatCondition.charAt(i))==0) {
				map.put(seatCondition.charAt(i), 1);	
			}else {
				map.put(seatCondition.charAt(i), map.get(seatCondition.charAt(i))+1);
			}
			
		}
		for (int i = 0; i < waitLength; i++) {
			if (sexs.charAt(i) == 'F') {
				sitFemale(seatCondition);
			} else {
				sitMale(seatCondition);
			}

		}
	}

	private static void sitMale(StringBuffer seatCondition) {
		if(map.get('1')>0) {
			int indexOf1 = seatCondition.indexOf("1");
			seatCondition.setCharAt(indexOf1, '2');
			map.put('1', map.get('1')-1);
			map.put('2', map.get('2')+1);
			System.out.println(indexOf1 + 1);
		}
		else {
			int indexOf0 = seatCondition.indexOf("0");
			seatCondition.setCharAt(indexOf0, '1');
			map.put('0', map.get('0')-1);
			map.put('1', map.get('1')+1);
			System.out.println(indexOf0 + 1);
		}
	}

	
	private static void sitFemale(StringBuffer seatCondition) {
		if (map.get('0')>0) {
			int indexOf0 = seatCondition.indexOf("0");
			seatCondition.setCharAt(indexOf0, '1');
			map.put('0', map.get('0')-1);
			map.put('1', map.get('1')+1);
			System.out.println(indexOf0 + 1);
		} else {
			int indexOf1 = seatCondition.indexOf("1");
			seatCondition.setCharAt(indexOf1, '2');
			map.put('1', map.get('1')-1);
			map.put('2', map.get('2')+1);
			System.out.println(indexOf1 + 1);
		}
	}

}
