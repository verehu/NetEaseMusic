package com.huwei.neteasemusic.util;

/**
 * @author jerry
 * @date 2016/05/20
 */
public class TimeUtil {

    /**
     * 获取dd hh mm ss
     *
     * @return
     */
    public static int[] getTimeArray(long second) {
        int[] t = new int[4];
        for (int i = 3; i >= 2; i--) {
            t[i] = (int) (second % 60);
            second /= 60;
        }

        t[1] = (int) (second % 24);
        t[0] = (int) (second /= 24);

        return t;
    }

    public static String getDuration(int duration){
        int[] time = getTimeArray(duration);
        return time[2] + ":" +time[3];
    }
}