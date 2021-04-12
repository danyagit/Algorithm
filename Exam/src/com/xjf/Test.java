package com.xjf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException{
//        //System.in代表键盘输入
//        Scanner sc = new Scanner(System.in);
//        //下面这行代码是把回车作为分隔符
//        sc.useDelimiter("\n");
//        //判断是否还有下一个输入项
//        while(sc.hasNext()){
//            //输出输入项
//            System.out.println("键盘输入的内容是："+sc.next());    
//        }
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int n = Integer.parseInt(br.readLine().trim());
	     System.out.println(n+"  55555555");
	     char[] str = br.readLine().trim().toCharArray();
	     System.out.println(str);
	     
    }
	
}
