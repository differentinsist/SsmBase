package com.yun;

import com.yun.domain.Fu;
import com.yun.domain.Zi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class test01 {

    public static void main(String[] args) throws ParseException {


        String value = String.valueOf(10033); //返回的是String类型的。
        System.out.println(value);

        //日历
//        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);

//        Object
//        Integer

//        Date date = new Date();
//        System.out.println(date);//Sun May 02 21:04:11 CST 2021
//        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");//传递进来字符串
//        Date pDate = format.parse("1996年12月26日 12时59分01秒");
//        System.out.println(pDate); //结果是日期格式：Thu Dec 26 00:59:01 CST 1996
//        System.out.println(2021-1970);
//        System.out.println("1970年距离当今等多少年:"+System.currentTimeMillis()/1000/60/60/24/365);

//        Zi z1 = new Zi("abc");
//        Zi z2 = new Zi("abc");
//        System.out.println(z1.name);
//        System.out.println(z1.name.equals(z2.name));
//        System.out.println(z1.equals(z2));

//        Fu result = new Zi();
//        String strFu = result.strFu;
//        Zi zi = new Zi();
//        String strZi = zi.strZi;
//        System.out.println(strFu.equals(strZi));

        //多态：
//        Zi z1 = new Zi();
//        System.out.println("变量："+z1.num);
//        System.out.println("函数："+z1.fiction1());
//        Fu z2 = new Zi();  //父类引用指向子类对象
//        System.out.println("变量："+z2.num);//居然使用的是父类的属性值（属性是这样）
//        System.out.println("函数："+z2.fiction1());//父类引用,父类有就使用父类的方法（方法是这样）

//        double a = -0.5;
//        double b = 3.202;
//        System.out.println("绝对值："+Math.abs(a));
//        System.out.println("向上取整："+Math.ceil(b));
//        System.out.println("向下取整："+Math.floor(4.02));
//        System.out.println("四舍五入："+Math.round(5.00102));
//        System.out.println("近似圆周率："+Math.PI);

//        //请使用Arrays相关api将随机字符串升序排序，并倒序打印。   使用其他api也可以吧
//        String str = "abdgfc7632";
//        char[] chars = str.toCharArray();//字符串变成数组了
//        Arrays.sort(chars);
//        System.out.println(chars);
//        char[] result = new char[chars.length];//注意这里
//        int b=0;
//        for (int i=chars.length-1; i>=0; i--,b++){
//            result[b] = chars[i];
//            //System.out.println(result[b]);
//        }
//        System.out.println(result);


//        int[] arr = {10, 40 ,30,20};
//        Arrays.sort(arr);
//        String arrStr = Arrays.toString(arr);
//        System.out.println(arrStr);
//        System.out.println(arr);
//        arrStr instanceof  ? (() arrStr) : null;
    }
}
