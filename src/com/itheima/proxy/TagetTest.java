package com.itheima.proxy;


import java.util.HashMap;

public class TagetTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","123");
        map.put("sex","nan");
        String age = map.get("age");
        System.out.println("args = [" + args + "]");
        map.remove("sex");
        System.out.println(map);

    }
}
