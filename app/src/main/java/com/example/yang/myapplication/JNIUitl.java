package com.example.yang.myapplication;

/**
 * Created by yang on 2018/3/8.
 */

public class JNIUitl {

    static
    {
        System.loadLibrary("JNISample");
    }

    public native String text();
}
