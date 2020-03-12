package com.metacoders.alama360apipractice.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("message")
    private String message;
    @SerializedName("code")
    private String code;
    @SerializedName("userid")
    private String userid;
    @SerializedName("usertype")
    private String usertype;
    @SerializedName("usermobile")
    private String usermobile;
    @SerializedName("userexist")
    private String userexist;
    @SerializedName("status")
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile;
    }

    public String getUserexist() {
        return userexist;
    }

    public void setUserexist(String userexist) {
        this.userexist = userexist;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
