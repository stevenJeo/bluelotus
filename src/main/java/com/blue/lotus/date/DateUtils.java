package com.blue.lotus.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouzhishuai on 2017/3/3.
 */
public class DateUtils {

    private static final String FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";


    /**
     * default date format : yyyy-MM-dd HH:mm:ss
     * eg." 2017-07-10 21:16:52 "
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        if (null == date) {
            return null;
        }
        return dateToString(date, FORMAT_PATTERN);

    }

    /**
     * Custom date format
     * <p/>
     * yyyy-MM-dd HH(hh):mm:ss S E D F w W a k K z
     * S毫秒 星期E 今年的第D天  这个月的第F星期  今年的第w个星期  这个月的第W个星期  今天的a  k1~24制时间  K0-11小时制时间  z时区
     * eg. 2013-08-14 15(03):56:40 742 星期三 226 2 33 3 下午 15 3 CST
     *
     * @param date
     * @param dateFormatStr
     * @return
     */
    public static String dateToString(Date date, String dateFormatStr) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormatStr);
        return format.format(date);
    }

    /**
     * default date format : yyyy-MM-dd HH:mm:ss
     * eg."2017-07-10 21:16:52"
     *
     * @param str
     * @return
     */
    public static Date stringToDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat(FORMAT_PATTERN);
        if (null != str && !"".equals(str)) {
            try {
                return format.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
