package com.atguigu.springcloud.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author yinhao
 * @date 2021/3/23 17:49
 */
public class TestDemo {
    public static void main(String[] args) throws Exception {
        String x = "2021-12-21 12:12:12";
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(x);
        System.out.println(date.getTime());
    }
}