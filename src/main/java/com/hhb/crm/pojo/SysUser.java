package com.hhb.crm.pojo;

/**
 * @ClassName : SysUser
 * @Author : River
 * @Description 用户pojo类
 * @Date: Create in 18:52 2018/6/30
 * @Modified By:
 */

public class SysUser {
    private Long userId;

    private String userCode;

    private String userName;

    private String userPassword;

    private String userState;

    public SysUser(Long userId, String userCode, String userName, String userPassword, String userState) {
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userState = userState;
    }

    public SysUser() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState == null ? null : userState.trim();
    }
}