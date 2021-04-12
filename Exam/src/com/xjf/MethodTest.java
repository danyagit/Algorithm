package com.xjf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * 鑾峰彇杩愯鏃剁被鐨勬柟娉曠粨鏋�
 *
 * @author shkstart
 * @create 2019 涓嬪崍 3:37
 */
public class MethodTest {

    @Test
    public void test1(){

        Class clazz = Person.class;

        //getMethods():鑾峰彇褰撳墠杩愯鏃剁被鍙婂叾鎵�鏈夌埗绫讳腑澹版槑涓簆ublic鏉冮檺鐨勬柟娉�
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println();
        //getDeclaredMethods():鑾峰彇褰撳墠杩愯鏃剁被涓０鏄庣殑鎵�鏈夋柟娉曘�傦紙涓嶅寘鍚埗绫讳腑澹版槑鐨勬柟娉曪級
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }
    }

    /*
    @Xxxx
    鏉冮檺淇グ绗�  杩斿洖鍊肩被鍨�  鏂规硶鍚�(鍙傛暟绫诲瀷1 褰㈠弬鍚�1,...) throws XxxException{}
     */
    @Test
    public void test2(){
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            //1.鑾峰彇鏂规硶澹版槑鐨勬敞瑙�
            Annotation[] annos = m.getAnnotations();
            for(Annotation a : annos){
                System.out.println(a);
            }

            //2.鏉冮檺淇グ绗�
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //3.杩斿洖鍊肩被鍨�
            System.out.print(m.getReturnType().getName() + "\t");

            //4.鏂规硶鍚�
            System.out.print(m.getName());
            System.out.print("(");
            //5.褰㈠弬鍒楄〃
            Class[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null && parameterTypes.length == 0)){
                for(int i = 0;i < parameterTypes.length;i++){

                    if(i == parameterTypes.length - 1){
                        System.out.print(parameterTypes[i].getName() + " args_" + i);
                        break;
                    }

                    System.out.print(parameterTypes[i].getName() + " args_" + i + ",");
                }
            }

            System.out.print(")");

            //6.鎶涘嚭鐨勫紓甯�
            Class[] exceptionTypes = m.getExceptionTypes();
            if(exceptionTypes.length > 0){
                System.out.print("throws ");
                for(int i = 0;i < exceptionTypes.length;i++){
                    if(i == exceptionTypes.length - 1){
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }

                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }


            System.out.println();
        }



    }
}
