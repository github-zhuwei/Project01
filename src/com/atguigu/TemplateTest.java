package com.atguigu;

import a.Cust;

import java.util.ArrayList;

/**
 * @author zhuwei
 * @data 2020/9/12 - 16:17
 *
 * 1.常用的模板
 */
public class TemplateTest {
    //模板六：prsf
    private static final Cust cust = new Cust();
    //变形：psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String STR = "";




    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        for (Object o : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }
    public void method(){
        System.out.println();
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);

        if (list == null) {
            
        }
        //变形:inn
        if (list != null) {
            
        }
        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }

    }
}
