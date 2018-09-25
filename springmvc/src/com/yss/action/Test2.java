package com.yss.action;
import java.util.Date;

public class Test2 {
    private int a = 2;
    private String name;
    private String no;
    private String b;

    private Date birthday;
    String c = new String("cc");

    public int getB() {
        return a;
    }


    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void test1() {
        System.out.print("hello,world");

    }

    public void test2() {
        System.out.print(a);
        test1();
    }

}
