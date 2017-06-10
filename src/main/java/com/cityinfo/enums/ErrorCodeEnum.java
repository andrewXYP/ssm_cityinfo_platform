package com.cityinfo.enums;

/**
 * Created by Administrator on 2017.04.24.
 */
public enum ErrorCodeEnum {
    E0000(0, "成功"),

    E0001(1, "参数错误"),

    E0002(2, "系统保留错误代码，请勿占用"),

    E0003(3, "系统保留错误代码，请勿占用"),

    E0004(4, "系统保留错误代码，请勿占用"),

    E0005(5, "系统保留错误代码，请勿占用"),

    E0006(6, "系统保留错误代码，请勿占用"),

    E0007(7, "系统保留错误代码，请勿占用"),

    E0008(8, "系统保留错误代码，请勿占用"),

    E0009(9, "系统保留错误代码，请勿占用"),

    E0010(10, "系统保留错误代码，请勿占用"),

    E0011(11,"手机号码已被占用"),

    E0012(12,"手机号码不存在"),

    E0013(13, "两次密码不同"),

    E0014(14,"验证码不匹配");

    private int code;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    private ErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
