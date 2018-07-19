package com.klxc.vo;

import com.klxc.common.Const;
import com.klxc.pojo.User;
import com.klxc.tool.UtilTool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserData {

    private boolean hasProve;
    private int approveSize;
    private String loginTime;

    public static User getUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session == null) {
            return new User();
        }
        return (User) session.getAttribute(Const.UserInfo);
    }

    public boolean isHasProve() {
        return hasProve;
    }

    public void setHasProve(String tabInfo) {
        if (UtilTool.isNull(tabInfo)) {
            hasProve = false;
        }
        if (tabInfo.contains("t2_4")) {
            hasProve = true;
        }
    }

    public int getApproveSize() {
        return approveSize;
    }

    public void setApproveSize(int approveSize) {
        this.approveSize = approveSize;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}