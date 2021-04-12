package com.xjf;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

/**
 * 浜嗚В绫荤殑鍔犺浇鍣�
 * @author shkstart
 * @create 2019 涓嬪崍 2:16
 */
public class ClassLoaderTest {

    @Test
    public void test1(){
        //瀵逛簬鑷畾涔夌被锛屼娇鐢ㄧ郴缁熺被鍔犺浇鍣ㄨ繘琛屽姞杞�
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        //璋冪敤绯荤粺绫诲姞杞藉櫒鐨刧etParent()锛氳幏鍙栨墿灞曠被鍔犺浇鍣�
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);
        //璋冪敤鎵╁睍绫诲姞杞藉櫒鐨刧etParent()锛氭棤娉曡幏鍙栧紩瀵肩被鍔犺浇鍣�
        //寮曞绫诲姞杞藉櫒涓昏璐熻矗鍔犺浇java鐨勬牳蹇冪被搴擄紝鏃犳硶鍔犺浇鑷畾涔夌被鐨勩��
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);

    }
    /*
    Properties锛氱敤鏉ヨ鍙栭厤缃枃浠躲��

     */
    @Test
    public void test2() throws Exception {

        Properties pros =  new Properties();
        //姝ゆ椂鐨勬枃浠堕粯璁ゅ湪褰撳墠鐨刴odule涓嬨��
        //璇诲彇閰嶇疆鏂囦欢鐨勬柟寮忎竴锛�
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc1.properties");
//        pros.load(fis);

        //璇诲彇閰嶇疆鏂囦欢鐨勬柟寮忎簩锛氫娇鐢–lassLoader
        //閰嶇疆鏂囦欢榛樿璇嗗埆涓猴細褰撳墠module鐨剆rc涓�
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        pros.load(is);


        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user + ",password = " + password);



    }

}
