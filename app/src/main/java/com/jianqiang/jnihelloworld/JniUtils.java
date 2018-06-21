package com.jianqiang.jnihelloworld;

public class JniUtils {

    //java调C中的方法都需要用native声明且方法名必须和c的方法名一样
    public native String getString();
}
