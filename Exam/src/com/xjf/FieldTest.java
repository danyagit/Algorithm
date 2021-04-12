package com.xjf;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * 鑾峰彇褰撳墠杩愯鏃剁被鐨勫睘鎬х粨鏋�
 *
 * @author shkstart
 * @create 2019 涓嬪崍 3:23
 */
public class FieldTest {

    @Test
    public void test1(){

        Class clazz = Person.class;

        //鑾峰彇灞炴�х粨鏋�
        //getFields():鑾峰彇褰撳墠杩愯鏃剁被鍙婂叾鐖剁被涓０鏄庝负public璁块棶鏉冮檺鐨勫睘鎬�
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println();

        //getDeclaredFields():鑾峰彇褰撳墠杩愯鏃剁被涓０鏄庣殑鎵�鏈夊睘鎬с�傦紙涓嶅寘鍚埗绫讳腑澹版槑鐨勫睘鎬э級
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //1.鏉冮檺淇グ绗�
            int modifier = f.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            //2.鏁版嵁绫诲瀷
            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            //3.鍙橀噺鍚�
            String fName = f.getName();
            System.out.print(fName);

            System.out.println();
        }


    }


}
