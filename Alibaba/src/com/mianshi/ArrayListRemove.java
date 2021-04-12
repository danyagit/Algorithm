package com.mianshi;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
	// abbccc
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		remove(list);

		for (String s : list) {
			System.out.println("element : " + s);
		}
	}

	public static void remove(ArrayList<String> list) {
//		����д��1��
//		for (int i = 0; i < list.size(); i++) {
//			String s = list.get(i);
//			if (s.equals("b")) {
//				list.remove(s);
//			}
//		}

		// �޸ģ��������
//		for (int i = list.size() - 1; i >= 0; i--) {
//			String s = list.get(i);
//			if (s.equals("b")) {
//				list.remove(s);
//			}
//		}

		
//		����д��2��
//		for (String s : list) {
//			if (s.equals("b")) {
//				list.remove(s);
//			}
//		}
		
//		�޸ģ�����iterator.remove������list.remove
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.equals("b")) {
				iterator.remove();
			}
		}

	}
}
