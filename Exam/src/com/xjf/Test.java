package com.xjf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException{
//        //System.in�����������
//        Scanner sc = new Scanner(System.in);
//        //�������д����ǰѻس���Ϊ�ָ���
//        sc.useDelimiter("\n");
//        //�ж��Ƿ�����һ��������
//        while(sc.hasNext()){
//            //���������
//            System.out.println("��������������ǣ�"+sc.next());    
//        }
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int n = Integer.parseInt(br.readLine().trim());
	     System.out.println(n+"  55555555");
	     char[] str = br.readLine().trim().toCharArray();
	     System.out.println(str);
	     
    }
	
}
