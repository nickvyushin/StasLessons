package com.staslesson;

public class SimpleProg {

    public static final int CONST = 46;
    enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };

    public static void main(String[] args) {
        System.out.println("We will not use 'Hello, World!'");

        var a = 3.14;
        var b = 2;
        var c = 523.109;
        final var CONST_INS = 3;
        Size s = Size.SMALL;
        Size m = Size.MEDIUM;
        Size l = Size.LARGE;
        Size xl = Size.EXTRA_LARGE;

        /*System.out.println("After the pandemic, the size of my clothes became " + l);

        System.out.println(a + CONST);
        System.out.println(b + CONST);
        System.out.println(CONST);
        System.out.println(CONST_INS + CONST);*/

        double x = 4;
        double y = Math.sqrt(x);
        /*System.out.println(y);*/
        double z = Math.pow(x, y);
        double sq = 4;
        double res = Math.pow(x, sq);
        /*System.out.println("This pow x and sq: " + res);
        System.out.println("This pow: " + z);*/
        var q = 3;
        var q2 =3;
        var ost = x % q;
        /*System.out.println(ost);
        var ost2 = Math.floorMod(q, q2);
        System.out.println(ost2);*/

        int n = 123456789;
        float f = n;
        /*System.out.println("int " + n);
        System.out.println("float " + f);*/
        double e = 3.3331;
        double e2 = 3.567;
        int ee = (int) Math.round(e);
        int ee2 = (int) Math.round(e2);
        int w = (int) e;
       /* System.out.println(w);
        System.out.println(ee + " меньше " + ee2);*/

        var h = 2 * ++q;
        var h2 = 2 * q2++;
        System.out.println("h = " + h + ", h2 = " + h2);
        System.out.println("q = " + q + ", q2 = " + q2);

        var t = 9;
        var k = 8;
        var result = t < k ? t : k;
        System.out.println(result);

        var str = "Hello";
        var postr = str.substring(0, 3);
        System.out.println(postr);
        var all = String.join("/", "t", "o", "r", "t");
        System.out.println(all);
        var ha = "Ha".repeat(3);
        System.out.println(ha);
        str = str.substring(0, 3) + "p!";
        System.out.println(str);
        System.out.println("help!".equalsIgnoreCase(str));
        var count = str.codePointCount(0, str.length());
        System.out.println(count);


        String gh = "Tony";

        /*System.out.println(a);
        System.out.println(a + c);
        System.out.println(a + b);
        var d = a + b;
        System.out.println(d);
        var e = '\u005B';
        System.out.println(e);
        var f = '\u2122';
        System.out.println("Coca-Cola" + f);
        System.out.println("Coca-Cola\u2122");*/

        var strEmp = "True";
        var strEmp2 = "";
        System.out.println(strEmp.isEmpty());
        System.out.println(strEmp2.isEmpty());




    }
}
