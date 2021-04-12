package com.xjf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2019 涓嬪崍 4:19
 */
public class OtherTest {

    /*
    鑾峰彇鏋勯�犲櫒缁撴瀯

     */
    @Test
    public void test1(){

        Class clazz = Person.class;
        //getConstructors():鑾峰彇褰撳墠杩愯鏃剁被涓０鏄庝负public鐨勬瀯閫犲櫒
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }

        System.out.println();
        //getDeclaredConstructors():鑾峰彇褰撳墠杩愯鏃剁被涓０鏄庣殑鎵�鏈夌殑鏋勯�犲櫒
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }

    }

    /*
    鑾峰彇杩愯鏃剁被鐨勭埗绫�

     */
    @Test
    public void test2(){
        Class clazz = Person.class;

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    /*
    鑾峰彇杩愯鏃剁被鐨勫甫娉涘瀷鐨勭埗绫�

     */
    @Test
    public void test3(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /*
    鑾峰彇杩愯鏃剁被鐨勫甫娉涘瀷鐨勭埗绫荤殑娉涘瀷


    浠ｇ爜锛氶�昏緫鎬т唬鐮�  vs 鍔熻兘鎬т唬鐮�
     */
    @Test
    public void test4(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //鑾峰彇娉涘瀷绫诲瀷
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
//        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

    /*
    鑾峰彇杩愯鏃剁被瀹炵幇鐨勬帴鍙�
     */
    @Test
    public void test5(){
        Class clazz = Person.class;

        Class[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }

        System.out.println();
        //鑾峰彇杩愯鏃剁被鐨勭埗绫诲疄鐜扮殑鎺ュ彛
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class c : interfaces1){
            System.out.println(c);
        }

    }
    /*
        鑾峰彇杩愯鏃剁被鎵�鍦ㄧ殑鍖�

     */
    @Test
    public void test6(){
        Class clazz = Person.class;

        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    /*
        鑾峰彇杩愯鏃剁被澹版槑鐨勬敞瑙�

     */
    @Test
    public void test7(){
        Class clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);
        }
    }

}
