package com.qianfeng.util;

public class ResMsg {
    private int code;
    private String msg;
    private Object data = null;

    public static ResMsg success(){
        ResMsg msg=new ResMsg();
        msg.setCode(200);
        msg.setMsg("处理成功");
        return msg;
    }
    public static ResMsg fail(){
        ResMsg msg=new ResMsg();
        msg.setCode(400);
        msg.setMsg("处理失败");
        return msg;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
