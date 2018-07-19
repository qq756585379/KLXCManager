package com.klxc.tool.email;

import com.klxc.pojo.InsuranceData;
import com.klxc.util.TimeTool;

import java.util.Date;

public class EmailTool {

    private static final String userName = "service@klxc123.com";
    private static final String password = "Qiujing!1@2#3";

    /**
     * 发送邮箱绑定信息
     */
    public static void sendHtml(String title, String to, String cc, String html) {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setMailServerHost("smtp.exmail.qq.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName(userName);
        mailInfo.setPassword(password);//您的邮箱密码
        mailInfo.setFromAddress(userName);
        mailInfo.setToAddress(to);
        mailInfo.setCc(cc);
        mailInfo.setSubject(title);
        mailInfo.setContent(html);
        SimpleMailSender.sendHtmlMail(mailInfo);
    }

    public static void main(String[] args) {
        String time = TimeTool.formatShortDateTime(new Date());
        EmailTool.sendHtml("快来学车预报案人员信息-" + time, "qiujing@laixc.net", "qiujing@laixc.net", InsuranceData.getInsuranceHtml("", null));
    }
}
