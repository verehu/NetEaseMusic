package com.huwei.neteasemusic.bean.resp;

/**
 * @author jerry
 * @date 2016/03/09
 */
public class CommonResp<T> extends ServerTip {
    //    "errno":xxx, //错误码
//            "desc":"xxxx", //错误信息
//            "data":{
//    }

    public T result;
}