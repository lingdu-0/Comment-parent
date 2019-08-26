package com.wb.travel.vo;

import javax.validation.constraints.Pattern;

public class LoginUserVo {
    @Pattern(regexp = "^1[0-9]{11}$", message = "电话号码格式不对!")
    private String userTel;
    @Pattern(regexp = "^\\w{6,16}$", message = "密码不合法!")
    private String password;

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUserVo{" +
                "userTel='" + userTel + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
