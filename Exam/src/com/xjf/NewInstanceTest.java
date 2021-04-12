package com.xjf;

import org.junit.Test;

import java.util.Random;

/**
 * 閫氳繃鍙戝皠鍒涘缓瀵瑰簲鐨勮繍琛屾椂绫荤殑瀵硅薄
 *
 * @author shkstart
 * @create 2019 涓嬪崍 2:32
 */
public class NewInstanceTest {

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {

        Class<Person> clazz = Person.class;
        /*
        newInstance():璋冪敤姝ゆ柟娉曪紝鍒涘缓瀵瑰簲鐨勮繍琛屾椂绫荤殑瀵硅薄銆傚唴閮ㄨ皟鐢ㄤ簡杩愯鏃剁被鐨勭┖鍙傜殑鏋勯�犲櫒銆�

        瑕佹兂姝ゆ柟娉曟甯哥殑鍒涘缓杩愯鏃剁被鐨勫璞★紝瑕佹眰锛�
        1.杩愯鏃剁被蹇呴』鎻愪緵绌哄弬鐨勬瀯閫犲櫒
        2.绌哄弬鐨勬瀯閫犲櫒鐨勮闂潈闄愬緱澶熴�傞�氬父锛岃缃负public銆�


        鍦╦avabean涓姹傛彁渚涗竴涓猵ublic鐨勭┖鍙傛瀯閫犲櫒銆傚師鍥狅細
        1.渚夸簬閫氳繃鍙嶅皠锛屽垱寤鸿繍琛屾椂绫荤殑瀵硅薄
        2.渚夸簬瀛愮被缁ф壙姝よ繍琛屾椂绫绘椂锛岄粯璁よ皟鐢╯uper()鏃讹紝淇濊瘉鐖剁被鏈夋鏋勯�犲櫒

         */
        Person obj = clazz.newInstance();
        System.out.println(obj);

    }

    //浣撲細鍙嶅皠鐨勫姩鎬佹��
    @Test
    public void test2(){

        for(int i = 0;i < 100;i++){
            int num = new Random().nextInt(3);//0,1,2
            String classPath = "";
            switch(num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "com.atguigu.java.Person";
                    break;
            }

            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    }

    /*
    鍒涘缓涓�涓寚瀹氱被鐨勫璞°��
    classPath:鎸囧畾绫荤殑鍏ㄧ被鍚�
     */
    public Object getInstance(String classPath) throws Exception {
       Class clazz =  Class.forName(classPath);
       return clazz.newInstance();
    }

}
