package com.atguigu.springcloud.entities;

import org.apache.commons.lang.StringUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yinhao
 * @date 2021/3/26 16:29
 */
public class DateTimeUtil {

    /**
     * date类型转字符串精确到秒
     * @param date
     * @return
     */
    public static String dateToStrSS(Date date){
        if(date == null){
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    /**
     * date类型转字符串精确到天
     * @param date
     * @return
     */
    public static String dateToStrDD(Date date){
        if(date == null){
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static Timestamp strToTimestamp(String str){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        ts = Timestamp.valueOf(str);
        return null;
    }
}
