package com.seh.bean;


/**
 * Created by xinhezhang on 2018/4/1.
 */
public class JsonResult {
    private String status = null;

    private Object result = null;

    public JsonResult status(String status) {
        this.status = status;
        return this;
    }
}
