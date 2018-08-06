package com.klxc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.klxc.common.Const;
import com.klxc.tool.UtilTool;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;

public class LoginInterceptor implements HandlerInterceptor {

    private final String LOGIN_URL = "/welcome.jsp";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        if (obj instanceof DefaultServletHttpRequestHandler) {
            return true;
        }
        String url = UtilTool.toString(request.getRequestURI());
        if (url.contains("toRegist") || url.contains("login") || url.contains("regist")) {
            return true;
        }

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute(Const.UserInfo) == null) {
            response.sendRedirect(request.getContextPath() + LOGIN_URL);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav)
            throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception err)
            throws Exception {
    }
}